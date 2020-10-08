package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> inputNumbers = new ArrayList<>();
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1) break;
            inputNumbers.add(number);
        }
        int sum = 0;
        for (int i : inputNumbers) {
            sum += i;
        }
        double middleArithmetic = (double)sum / inputNumbers.size();
        System.out.println(middleArithmetic);
    }
}

