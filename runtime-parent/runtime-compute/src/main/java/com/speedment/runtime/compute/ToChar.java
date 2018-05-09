package com.speedment.runtime.compute;

import com.speedment.common.function.CharUnaryOperator;
import com.speedment.common.function.ToCharFunction;
import com.speedment.runtime.compute.expression.Expression;
import com.speedment.runtime.compute.expression.ExpressionType;
import com.speedment.runtime.compute.internal.expression.CastUtil;
import com.speedment.runtime.compute.internal.expression.ComposedUtil;
import com.speedment.runtime.compute.internal.expression.MapperUtil;
import com.speedment.runtime.compute.trait.*;
import static java.util.Objects.requireNonNull;

import java.util.function.Function;

/**
 * Expression that given an entity returns a {@code char} value. This expression
 * can be implemented using a lambda, or it can be a result of another
 * operation. It has additional methods for operating on it.
 *
 * @param <T> type to extract from
 *
 * @see ToCharFunction
 *
 * @author Emil Forslund
 * @since 3.1.0
 */
@FunctionalInterface
public interface ToChar<T>
extends Expression<T>,
        ToCharFunction<T>,
        HasAsDouble<T>,
        HasAsInt<T>,
        HasAsLong<T>,
        HasMap<T, CharUnaryOperator, ToChar<T>>,
        HasCase<T, ToChar<T>>,
        HasHash<T>,
        HasCompare<T>,
        HasCompose<T> {
    
    /**
     * Returns a typed {@code ToChar<T>} using the provided {@code lambda}.
     *
     * @param <T> type to extract from
     * @param lambda to convert
     * @return a typed {@code ToChar<T>} using the provided {@code lambda}
     *
     * @throws NullPointerException if the provided {@code lambda} is
     * {@code null}
     */
    static <T> ToChar<T> of(ToCharFunction<T> lambda) {
        if (lambda instanceof ToChar) {
            return (ToChar<T>) lambda;
        } else {
            return lambda::applyAsChar;
        }
    }

    @Override
    default ExpressionType expressionType() {
        return ExpressionType.CHAR;
    }

    @Override
    default ToDouble<T> asDouble() {
        return CastUtil.castCharToDouble(this);
    }

    @Override
    default ToInt<T> asInt() {
        return CastUtil.castCharToInt(this);
    }

    @Override
    default ToLong<T> asLong() {
        return CastUtil.castCharToLong(this);
    }

    @Override
    default ToChar<T> map(CharUnaryOperator operator) {
        return MapperUtil.mapChar(this, operator);
    }

    @Override
    default ToChar<T> toUpperCase() {
        return map(Character::toUpperCase);
    }

    @Override
    default ToChar<T> toLowerCase() {
        return map(Character::toLowerCase);
    }

    @Override
    default long hash(T object) {
        return applyAsChar(object);
    }

    @Override
    default int compare(T first, T second) {
        final char f = applyAsChar(first);
        final char s = applyAsChar(second);
        return Character.compare(f, s);
    }

    @Override
    default <V> ToChar<V> compose(Function<? super V, ? extends T> before) {
        @SuppressWarnings("unchecked")
        final Function<V, T> casted = (Function<V, T>) before;
        return ComposedUtil.composeToChar(casted, this);
    }
}