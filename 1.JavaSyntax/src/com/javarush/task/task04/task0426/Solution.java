package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        boolean isPositive = (number > 0);
        boolean isNegative = (number < 0);
        boolean isEven = (number % 2 == 0);

        if (isNegative) {
            if (isEven) System.out.println("отрицательное четное число");
            else System.out.println("отрицательное нечетное число");
        } else if (isPositive) {
            if (isEven) System.out.println("положительное четное число");
            else System.out.println("положительное нечетное число");
        } else {
            System.out.println("ноль");
        }

    }
}
