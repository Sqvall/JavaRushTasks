package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        int yCount = 0;
        while (yCount < 10) {
            int xCount = 0;
            while (xCount < 10) {
                System.out.print("S");
                xCount++;
            }
            System.out.println();
            yCount++;
        }

    }
}
