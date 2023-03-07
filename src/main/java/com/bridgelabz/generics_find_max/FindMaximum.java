package com.bridgelabz.generics_find_max;

public class FindMaximum < T extends Comparable> {

    T valueOne, valueTwo, valueThree;

    public FindMaximum (T valueOne, T valueTwo, T valueThree) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.valueThree = valueThree;
    }
    public static void main(String[] args) {
        Integer numberOne = 12, numberTwo = 15, numberThree = 21;
        Float numberOneFloat = 12.5f, numberTwoFloat = 15.45f, numberThreeFloat = 21.65f;
        String stringOne = "Apple", stringTwo = "Mango", stringThree = "Pineapple";
        System.out.println("Maximum is " + getMaximum(numberOne, numberTwo, numberThree));
        System.out.println("Maximum is " + getMaximum(numberOneFloat, numberTwoFloat, numberThreeFloat));
        System.out.println("Maximum is " + getMaximum(stringOne, stringTwo, stringThree));
    }

    public static < E extends Comparable > E getMaximum(E stringOne, E stringTwo, E stringThree) {
        E maximum = stringOne;
        if (stringTwo.compareTo(maximum) > 0)
            maximum = stringTwo;
        if (stringThree.compareTo(maximum) > 0)
            maximum = stringThree;
        return maximum;
    }
}
