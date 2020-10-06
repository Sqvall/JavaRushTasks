package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] inputNumbers = new int[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < inputNumbers.length; i++) {
            inputNumbers[i] = Integer.parseInt(reader.readLine());
        }

        if (inputNumbers[0] == inputNumbers[1])
                System.out.println(3);
        else if (inputNumbers[1] == inputNumbers[2])
                System.out.println(1);
        else if (inputNumbers[2] == inputNumbers[0])
                System.out.println(2);
    }
}
