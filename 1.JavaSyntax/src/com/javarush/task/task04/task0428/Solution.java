package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> inputNumbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            inputNumbers.add(Integer.parseInt(reader.readLine()));
        }

        int positiveCount = 0;

        for (int i : inputNumbers) {
            if (i > 0) positiveCount++;
        }

        System.out.println(positiveCount);

    }
}
