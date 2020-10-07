package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();

        boolean isOdd = (Integer.parseInt(number) % 2 != 0);

        if (Integer.parseInt(number) < 1 || Integer.parseInt(number) > 999);
        else if (isOdd) {
            if (number.length() == 1) System.out.println("нечетное однозначное число");
            else if (number.length() == 2) System.out.println("нечетное двузначное число");
            else if (number.length() == 3) System.out.println("нечетное трехзначное число");
        } else {
            if (number.length() == 1) System.out.println("четное однозначное число");
            else if (number.length() == 2) System.out.println("четное двузначное число");
            else if (number.length() == 3) System.out.println("четное трехзначное число");
        }

    }
}
