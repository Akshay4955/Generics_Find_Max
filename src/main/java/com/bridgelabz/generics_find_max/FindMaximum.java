package com.bridgelabz.generics_find_max;

public class FindMaximum {
    public static void main(String[] args) {
        Integer numberOne = 12, numberTwo = 15, numberThree = 21;
        Float numberOneFloat = 12.5f, numberTwoFloat = 15.45f, numberThreeFloat = 21.65f;
        System.out.println("Maximum is " + new FindMaximum().getMaximum(numberOne, numberTwo, numberThree));
        System.out.println("Maximum is " + new FindMaximum().getMaximum(numberOneFloat, numberTwoFloat, numberThreeFloat));
    }

    public Integer getMaximum(Integer numberOne, Integer numberTwo, Integer numberThree) {
        Integer maximum = numberOne;
        if (numberTwo.compareTo(maximum) > 0)
            maximum = numberTwo;
        if (numberThree.compareTo(maximum) > 0)
            maximum = numberThree;
        return maximum;
    }

    public Float getMaximum(Float numberOne, Float numberTwo, Float numberThree) {
        Float maximum = numberOne;
        if (numberTwo.compareTo(maximum) > 0)
            maximum = numberTwo;
        if (numberThree.compareTo(maximum) > 0)
            maximum = numberThree;
        return maximum;
    }
}
