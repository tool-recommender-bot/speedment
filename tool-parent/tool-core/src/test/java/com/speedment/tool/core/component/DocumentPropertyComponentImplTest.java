/**
 *
 * Copyright (c) 2006-2019, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.tool.core.component;

import com.speedment.generator.core.GeneratorBundle;
import com.speedment.runtime.application.ApplicationBuilders;
import com.speedment.runtime.config.Dbms;
import com.speedment.runtime.config.Project;
import com.speedment.runtime.config.Schema;
import com.speedment.runtime.config.mutator.DbmsMutator;
import com.speedment.runtime.core.Speedment;
import com.speedment.runtime.core.internal.util.ImmutableListUtil;
import com.speedment.tool.config.*;
import com.speedment.tool.config.component.DocumentPropertyComponent;
import com.speedment.tool.config.internal.component.DocumentPropertyComponentImpl;
import com.speedment.tool.core.ToolBundle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Emil Forslund
 */
final class DocumentPropertyComponentImplTest {

    private Speedment speedment;
    private DocumentPropertyComponent component;

    @BeforeEach
    void setUp() {
        speedment = ApplicationBuilders.empty()
            .withBundle(GeneratorBundle.class)
            .withBundle(ToolBundle.class)
            .withSkipCheckDatabaseConnectivity()
            .withSkipValidateRuntimeConfig()
            .build();
        
        component = speedment.getOrThrow(DocumentPropertyComponent.class);
    }

    @Test
    @Disabled
    void testStructure() {
        final Field root;
        try {
            root = DocumentPropertyComponentImpl.class.getDeclaredField("root");
            root.setAccessible(true);

            final Method toString = root.getType().getMethod("toString");
            final Object rootObj = root.get(component);

            if (rootObj == null) {
                throw new NullPointerException("Root is null.");
            }

            final Object o = toString.invoke(rootObj);
            //System.out.println(o);

        } catch (final NoSuchFieldException 
            | NoSuchMethodException 
            | SecurityException 
            | IllegalAccessException 
            | InvocationTargetException ex) {
            
            throw new RuntimeException("Could not call toString on component", ex);
        }
    }

    @Test
    void testDefaultInstallments() {

        final DocumentProperty project = component.getConstructor(DocumentPropertyComponent.PROJECTS).create(null);
        final DocumentProperty dbms = component.getConstructor(DocumentPropertyComponent.DBMSES).create(project);
        final DocumentProperty schema = component.getConstructor(DocumentPropertyComponent.SCHEMAS).create(dbms);
        final DocumentProperty table = component.getConstructor(DocumentPropertyComponent.TABLES).create(schema);
        final DocumentProperty column = component.getConstructor(DocumentPropertyComponent.COLUMNS).create(table);
        final DocumentProperty index = component.getConstructor(DocumentPropertyComponent.INDEXES).create(table);
        final DocumentProperty indexColumn = component.getConstructor(DocumentPropertyComponent.INDEX_COLUMNS).create(index);
        final DocumentProperty foreignKey = component.getConstructor(DocumentPropertyComponent.FOREIGN_KEYS).create(table);
        final DocumentProperty foreignKeyColumn = component.getConstructor(DocumentPropertyComponent.FOREIGN_KEY_COLUMNS).create(foreignKey);
        final DocumentProperty primaryKey = component.getConstructor(DocumentPropertyComponent.PRIMARY_KEY_COLUMNS).create(table);

        assertEquals(ProjectProperty.class, project.getClass(), "Make sure ProjectProperty is used by default: ");
        assertEquals(DbmsProperty.class, dbms.getClass(), "Make sure DbmsProperty is used by default: ");
        assertEquals(SchemaProperty.class, schema.getClass(), "Make sure SchemaProperty is used by default: ");
        assertEquals(TableProperty.class, table.getClass(), "Make sure TableProperty is used by default: ");
        assertEquals(ColumnProperty.class, column.getClass(), "Make sure ColumnProperty is used by default: ");
        assertEquals(IndexProperty.class, index.getClass(), "Make sure IndexProperty is used by default: ");
        assertEquals(IndexColumnProperty.class, indexColumn.getClass(), "Make sure IndexColumnProperty is used by default: ");
        assertEquals(ForeignKeyProperty.class, foreignKey.getClass(), "Make sure ForeignKeyProperty is used by default: ");
        assertEquals(ForeignKeyColumnProperty.class, foreignKeyColumn.getClass(), "Make sure ForeignKeyColumnProperty is used by default: ");
        assertEquals(PrimaryKeyColumnProperty.class, primaryKey.getClass(), "Make sure PrimaryKeyColumnProperty is used by default: ");
    }

    @Test
    void testAlternateInstallments() {
        component.setConstructor(parent -> new AlternativeDbms((Project) parent), DocumentPropertyComponent.DBMSES);

        final DocumentProperty project = component.getConstructor(DocumentPropertyComponent.PROJECTS).create(null);
        final DocumentProperty dbms = component.getConstructor(DocumentPropertyComponent.DBMSES).create(project);

        assertEquals(ProjectProperty.class, project.getClass());
        assertEquals(AlternativeDbms.class, dbms.getClass());
    }

    private final static class AlternativeDbms extends AbstractChildDocumentProperty<Project, AlternativeDbms> implements Dbms {

        public AlternativeDbms(Project parent) {
            super(parent);
        }

        @Override
        protected List<String> keyPathEndingWith(String key) {
            return ImmutableListUtil.concat(DocumentPropertyComponent.DBMSES, key);
        }

        @Override
        public DbmsMutator<Dbms> mutator() {
            throw new UnsupportedOperationException("Not required by test.");
        }

        @Override
        public Stream<? extends Schema> schemas() {
            throw new UnsupportedOperationException("Not required by test.");
        }
    }
}
