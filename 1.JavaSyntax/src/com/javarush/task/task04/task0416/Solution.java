package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float second = Float.parseFloat(reader.readLine()) % 10;

        if ((second >= 3 && second < 4) || (second >= 8 && second < 9)) {
            System.out.println("жёлтый");
        } else if ((second >= 4 && second < 5) || (second >= 9)) {
            System.out.println("красный");
        } else {
            System.out.println("зеленый");
        }

    }
}