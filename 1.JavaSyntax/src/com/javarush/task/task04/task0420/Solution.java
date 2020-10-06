package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> inputNumbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            inputNumbers.add(Integer.parseInt(reader.readLine()));
        }

        inputNumbers.sort(Collections.reverseOrder());

        for (int i : inputNumbers)
            System.out.print(i + " ");
    }
}
