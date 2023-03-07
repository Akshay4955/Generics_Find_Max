package com.bridgelabz.generics_find_max;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaximum <T> {

    public static void main(String[] args) {
        Integer numberOne = 12, numberTwo = 15, numberThree = 21;
        Float numberOneFloat = 12.5f, numberTwoFloat = 15.45f, numberThreeFloat = 21.65f;
        String stringOne = "Apple", stringTwo = "Mango", stringThree = "Pineapple";
        System.out.println("Maximum is " + getMaximum(numberOne, numberTwo, numberThree));
        System.out.println("Maximum is " + getMaximum(numberOneFloat, numberTwoFloat, numberThreeFloat));
        System.out.println("Maximum is " + getMaximum(stringOne, stringTwo, stringThree));
        System.out.println("Maximum is " + getMaximumForMoreThanThree(2, 5, 8, 14, 18, 28, 32, 45, 48,56,34,87));
    }

    public static <E extends Comparable> E getMaximum(E stringOne, E stringTwo, E stringThree) {
        E maximum = stringOne;
        if (stringTwo.compareTo(maximum) > 0)
            maximum = stringTwo;
        if (stringThree.compareTo(maximum) > 0)
            maximum = stringThree;
        return maximum;
    }

    public static <T> T getMaximumForMoreThanThree(T valueOne, T... args) {
//        List<T> listOfParameters = Arrays.asList(args);
        Arrays.sort(args);
        return args[args.length-1];
    }
}
