package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int salary = Integer.parseInt(reader.readLine());
        int afterAge = Integer.parseInt(reader.readLine());

        System.out.printf("%s получает %d через %d лет.", name, salary, afterAge);
    }
}
