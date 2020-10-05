package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] weeklyDays = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int dayNumber = Integer.parseInt(reader.readLine());

        if (dayNumber - 1 < weeklyDays.length && dayNumber > 0) {
            System.out.println(weeklyDays[dayNumber - 1]);
        } else {
            System.out.println("такого дня недели не существует");
        }
    }
}