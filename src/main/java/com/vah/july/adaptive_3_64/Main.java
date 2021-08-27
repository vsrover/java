package com.vah.july.adaptive_3_64;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Main {


    /**
     * The operator combines all values in the given range into one value
     * using combiner and initial value (seed)
     */
    public static final BiFunction<Integer, IntBinaryOperator, IntBinaryOperator> reduceIntOperator =
            (seed, v) -> (left, right) -> {
                int res = seed;
                for (int i = left; i <= right; i++) {
                    res = v.applyAsInt(res, i);
                }
                return res;
            };

    /**
     * The operator calculates the sum in the given range (inclusively)
     */
    public static final IntBinaryOperator sumOperator = reduceIntOperator.apply(0, (x, y) -> x + y);


    /**
     * The operator calculates the product in the given range (inclusively)
     */
    public static final IntBinaryOperator productOperator = reduceIntOperator.apply(1, (x, y) -> x * y);
    public static void main(String[] args) {
        IntBinaryOperator sum = (x, y) -> x + y;
        IntBinaryOperator resultWithSumOperator = reduceIntOperator.apply(2, sum);
        System.out.println(resultWithSumOperator.applyAsInt(5, 6));   // 15 = 5 + (1 + 2 + 3 + 4)

        IntBinaryOperator multiply = (x, y) -> x * y;
        IntBinaryOperator resultWitMultiplyOperator = reduceIntOperator.apply(2, multiply);
        System.out.println(resultWitMultiplyOperator.applyAsInt(5, 6));   // 120 = 5 * (1 * 2 * 3 * 4)
    }
}
