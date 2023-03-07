package com.bridgelabz.generics_find_max;

public class FindMaximumInteger {
    public static void main(String[] args) {
            Integer numberOne = 12, numberTwo = 15, numberThree = 21;
        System.out.println("Maximum is " + new FindMaximumInteger().getMaximum(numberOne, numberTwo, numberThree));
    }

    public Integer getMaximum(Integer numberOne, Integer numberTwo, Integer numberThree) {
        Integer maximum = numberOne;
        if (numberTwo.compareTo(maximum) > 0)
            maximum = numberTwo;
        if (numberThree.compareTo(maximum) > 0)
            maximum = numberThree;
        return maximum;
    }
}
