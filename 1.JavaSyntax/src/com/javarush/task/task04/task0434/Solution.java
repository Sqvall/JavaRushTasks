package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        int yMultiplier = 1;
        while (yMultiplier <= 10) {
            int xMultiplier = 1;
            while (xMultiplier <= 10) {
                System.out.print((yMultiplier * xMultiplier) + " ");
                xMultiplier++;
            }
            System.out.println();
            yMultiplier++;
        }

    }
}
