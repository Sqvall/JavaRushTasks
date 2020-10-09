package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(numbers);

        for (int i : numbers) {
            System.out.println(i);
        }

    }
}
