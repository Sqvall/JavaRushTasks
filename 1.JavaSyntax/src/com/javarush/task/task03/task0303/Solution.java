package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        double first = convertEurToUsd(123, 1.2);
        double second = convertEurToUsd(100, 1.13);
        System.out.println(first);
        System.out.println(second);
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
    }
}
