/**
 * 
 * Copyright (c) 2006-2017, Speedment, Inc. All Rights Reserved.
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
package com.speedment.common.tuple;

/**
 * This class is a Builder that can be used to build type safe Tuple of degree
 * up to 23 that can hold non-null
 * values.
 * 
 * @author Per Minborg
 */
public class TupleBuilder {
    
    private Tuple current;
    
    private TupleBuilder() {
        this.current = Tuples.of();
    }
    
    public static Builder0 builder() {
        return new TupleBuilder().new Builder0();
    }
    
    public class Builder0 extends BaseBuilder<Tuple0> {
        
        public <T0> Builder1<T0> add(T0 e0) {
            current = Tuples.of(    
                e0
            );
            return new Builder1<>();
        }
    }
    
    public class Builder1<T0> extends BaseBuilder<Tuple1<T0>> {
        
        public <T1> Builder2<T0, T1> add(T1 e1) {
            current = Tuples.of(    
                current.get(0),
                e1
            );
            return new Builder2<>();
        }
    }
    
    public class Builder2<T0, T1> extends BaseBuilder<Tuple2<T0, T1>> {
        
        public <T2> Builder3<T0, T1, T2> add(T2 e2) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                e2
            );
            return new Builder3<>();
        }
    }
    
    public class Builder3<T0, T1, T2> extends BaseBuilder<Tuple3<T0, T1, T2>> {
        
        public <T3> Builder4<T0, T1, T2, T3> add(T3 e3) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                e3
            );
            return new Builder4<>();
        }
    }
    
    public class Builder4<T0, T1, T2, T3> extends BaseBuilder<Tuple4<T0, T1, T2, T3>> {
        
        public <T4> Builder5<T0, T1, T2, T3, T4> add(T4 e4) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                e4
            );
            return new Builder5<>();
        }
    }
    
    public class Builder5<T0, T1, T2, T3, T4> extends BaseBuilder<Tuple5<T0, T1, T2, T3, T4>> {
        
        public <T5> Builder6<T0, T1, T2, T3, T4, T5> add(T5 e5) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                e5
            );
            return new Builder6<>();
        }
    }
    
    public class Builder6<T0, T1, T2, T3, T4, T5> extends BaseBuilder<Tuple6<T0, T1, T2, T3, T4, T5>> {
        
        public <T6> Builder7<T0, T1, T2, T3, T4, T5, T6> add(T6 e6) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                e6
            );
            return new Builder7<>();
        }
    }
    
    public class Builder7<T0, T1, T2, T3, T4, T5, T6> extends BaseBuilder<Tuple7<T0, T1, T2, T3, T4, T5, T6>> {
        
        public <T7> Builder8<T0, T1, T2, T3, T4, T5, T6, T7> add(T7 e7) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                e7
            );
            return new Builder8<>();
        }
    }
    
    public class Builder8<T0, T1, T2, T3, T4, T5, T6, T7> extends BaseBuilder<Tuple8<T0, T1, T2, T3, T4, T5, T6, T7>> {
        
        public <T8> Builder9<T0, T1, T2, T3, T4, T5, T6, T7, T8> add(T8 e8) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                e8
            );
            return new Builder9<>();
        }
    }
    
    public class Builder9<T0, T1, T2, T3, T4, T5, T6, T7, T8> extends BaseBuilder<Tuple9<T0, T1, T2, T3, T4, T5, T6, T7, T8>> {
        
        public <T9> Builder10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> add(T9 e9) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                current.get(8),
                e9
            );
            return new Builder10<>();
        }
    }
    
    public class Builder10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> extends BaseBuilder<Tuple10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>> {
        
        public <T10> Builder11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> add(T10 e10) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                current.get(8),
                current.get(9),
                e10
            );
            return new Builder11<>();
        }
    }
    
    public class Builder11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> extends BaseBuilder<Tuple11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> {
        
        public <T11> Builder12<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> add(T11 e11) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                current.get(8),
                current.get(9),
                current.get(10),
                e11
            );
            return new Builder12<>();
        }
    }
    
    public class Builder12<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> extends BaseBuilder<Tuple12<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> {
        
        public <T12> Builder13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> add(T12 e12) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                current.get(8),
                current.get(9),
                current.get(10),
                current.get(11),
                e12
            );
            return new Builder13<>();
        }
    }
    
    public class Builder13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> extends BaseBuilder<Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> {
        
        public <T13> Builder14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> add(T13 e13) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                current.get(8),
                current.get(9),
                current.get(10),
                current.get(11),
                current.get(12),
                e13
            );
            return new Builder14<>();
        }
    }
    
    public class Builder14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> extends BaseBuilder<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> {
        
        public <T14> Builder15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> add(T14 e14) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                current.get(8),
                current.get(9),
                current.get(10),
                current.get(11),
                current.get(12),
                current.get(13),
                e14
            );
            return new Builder15<>();
        }
    }
    
    public class Builder15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> extends BaseBuilder<Tuple15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> {
        
        public <T15> Builder16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> add(T15 e15) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                current.get(8),
                current.get(9),
                current.get(10),
                current.get(11),
                current.get(12),
                current.get(13),
                current.get(14),
                e15
            );
            return new Builder16<>();
        }
    }
    
    public class Builder16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> extends BaseBuilder<Tuple16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> {
        
        public <T16> Builder17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> add(T16 e16) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                current.get(8),
                current.get(9),
                current.get(10),
                current.get(11),
                current.get(12),
                current.get(13),
                current.get(14),
                current.get(15),
                e16
            );
            return new Builder17<>();
        }
    }
    
    public class Builder17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> extends BaseBuilder<Tuple17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>> {
        
        public <T17> Builder18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> add(T17 e17) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                current.get(8),
                current.get(9),
                current.get(10),
                current.get(11),
                current.get(12),
                current.get(13),
                current.get(14),
                current.get(15),
                current.get(16),
                e17
            );
            return new Builder18<>();
        }
    }
    
    public class Builder18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends BaseBuilder<Tuple18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>> {
        
        public <T18> Builder19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> add(T18 e18) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                current.get(8),
                current.get(9),
                current.get(10),
                current.get(11),
                current.get(12),
                current.get(13),
                current.get(14),
                current.get(15),
                current.get(16),
                current.get(17),
                e18
            );
            return new Builder19<>();
        }
    }
    
    public class Builder19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> extends BaseBuilder<Tuple19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>> {
        
        public <T19> Builder20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> add(T19 e19) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                current.get(8),
                current.get(9),
                current.get(10),
                current.get(11),
                current.get(12),
                current.get(13),
                current.get(14),
                current.get(15),
                current.get(16),
                current.get(17),
                current.get(18),
                e19
            );
            return new Builder20<>();
        }
    }
    
    public class Builder20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> extends BaseBuilder<Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>> {
        
        public <T20> Builder21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> add(T20 e20) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                current.get(8),
                current.get(9),
                current.get(10),
                current.get(11),
                current.get(12),
                current.get(13),
                current.get(14),
                current.get(15),
                current.get(16),
                current.get(17),
                current.get(18),
                current.get(19),
                e20
            );
            return new Builder21<>();
        }
    }
    
    public class Builder21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> extends BaseBuilder<Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>> {
        
        public <T21> Builder22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> add(T21 e21) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                current.get(8),
                current.get(9),
                current.get(10),
                current.get(11),
                current.get(12),
                current.get(13),
                current.get(14),
                current.get(15),
                current.get(16),
                current.get(17),
                current.get(18),
                current.get(19),
                current.get(20),
                e21
            );
            return new Builder22<>();
        }
    }
    
    public class Builder22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> extends BaseBuilder<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>> {
        
        public <T22> Builder23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> add(T22 e22) {
            current = Tuples.of(    
                current.get(0),
                current.get(1),
                current.get(2),
                current.get(3),
                current.get(4),
                current.get(5),
                current.get(6),
                current.get(7),
                current.get(8),
                current.get(9),
                current.get(10),
                current.get(11),
                current.get(12),
                current.get(13),
                current.get(14),
                current.get(15),
                current.get(16),
                current.get(17),
                current.get(18),
                current.get(19),
                current.get(20),
                current.get(21),
                e22
            );
            return new Builder23<>();
        }
    }
    
    public class Builder23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> extends BaseBuilder<Tuple23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>> {}
    
    private class BaseBuilder<T> {
        
        @SuppressWarnings("unchecked")
        public T build() {
            return (T) current;
        }
    }
}