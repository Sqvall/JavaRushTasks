package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rate = Integer.parseInt(reader.readLine());

        System.out.printf("Я буду зарабатывать $%d в час", rate);
    }
}
