package com.bridgelabz.generics_find_max;

import java.util.Arrays;

public class FindMaximum <T> {

    public static void main(String[] args) {
        Integer numberOne = 12, numberTwo = 15, numberThree = 21;
        Float numberOneFloat = 12.5f, numberTwoFloat = 15.45f, numberThreeFloat = 21.65f;
        String stringOne = "Apple", stringTwo = "Mango", stringThree = "Pineapple";
        getMaximum(numberOne, numberTwo, numberThree);
        getMaximum(numberOneFloat, numberTwoFloat, numberThreeFloat);
        getMaximum(stringOne, stringTwo, stringThree);
        getMaximumForMoreThanThree(2, 5, 8, 14, 18, 28, 32, 45, 48,56,34,87);
    }

    public static <E extends Comparable> void getMaximum(E stringOne, E stringTwo, E stringThree) {
        E maximum = stringOne;
        if (stringTwo.compareTo(maximum) > 0)
            maximum = stringTwo;
        if (stringThree.compareTo(maximum) > 0)
            maximum = stringThree;
        System.out.println("Maximum is " + maximum);
    }

    public static <T> void getMaximumForMoreThanThree(T valueOne, T... args) {
        Arrays.sort(args);
        System.out.println("Maximum is " + args[args.length - 1]);
    }
}
