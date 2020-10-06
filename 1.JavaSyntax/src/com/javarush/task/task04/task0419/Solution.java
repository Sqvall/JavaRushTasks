package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] inputNumbers = new int[4];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < inputNumbers.length; i++) {
            inputNumbers[i] = Integer.parseInt(reader.readLine());
        }

        int max = inputNumbers[0];

        for (int i : inputNumbers) {
            max = Math.max(max, i);
        }

        System.out.println(max);
    }
}
