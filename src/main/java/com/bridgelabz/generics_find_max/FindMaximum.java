package com.bridgelabz.generics_find_max;

public class FindMaximum {
    public static void main(String[] args) {
        Integer numberOne = 12, numberTwo = 15, numberThree = 21;
        Float numberOneFloat = 12.5f, numberTwoFloat = 15.45f, numberThreeFloat = 21.65f;
        String stringOne = "Apple", stringTwo = "Mango", stringThree = "Pineapple";
        System.out.println("Maximum is " + new FindMaximum().getMaximum(numberOne, numberTwo, numberThree));
        System.out.println("Maximum is " + new FindMaximum().getMaximum(numberOneFloat, numberTwoFloat, numberThreeFloat));
        System.out.println("Maximum is " + new FindMaximum().getMaximum(stringOne, stringTwo, stringThree));
    }

    public < E extends Comparable > E getMaximum(E stringOne, E stringTwo, E stringThree) {
        E maximum = stringOne;
        if (stringTwo.compareTo(maximum) > 0)
            maximum = stringTwo;
        if (stringThree.compareTo(maximum) > 0)
            maximum = stringThree;
        return maximum;
    }
}
