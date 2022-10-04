package SquareProject;

import java.util.function.BiPredicate;

public class OtherFunctionalInterface {
    BiPredicate<int[], Integer> contains = (arr, num) -> {
        for (int each : arr) {
            if (each == num) {
                return true;
            }
        }
        return false;
    };

}