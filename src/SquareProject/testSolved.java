package SquareProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class testSolved {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 2, 5, 8, 7, 3, 9, 6, 32, 5, 78, 12, 14);
        getNearestValue(-9, numbers);

    }

    public static void getNearestValue(Integer value, List<Integer> numbers) {
        Collections.sort(numbers);

        int smallest = numbers.get(0);
        int nearTarget = numbers.get(0);

        for (int each : numbers) {
            if (each <= value) {
                smallest = each;
            } else if (each > value) {
                nearTarget = each;
                break;
            }
        }
        if (value - smallest > nearTarget - value) {
            System.out.println(" nearestNumberInArray (" + value + ") -> " + nearTarget);
        } else if (value - smallest < nearTarget - value) {
            System.out.println(" nearestNumberInArray (" + value + ") -> " + smallest);
        } else {
            System.out.println(" nearestNumberInArray (" + value + ") -> " + smallest);
            System.out.println(" nearestNumberInArray (" + value + ") -> " + nearTarget);
        }

        System.out.println(numbers);


    }
}
