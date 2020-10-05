package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int number) {
        if (number <= 100 && number >=50) System.out.printf("Число %d содержится в интервале.\n", number);
        else System.out.printf("Число %d не содержится в интервале.\n", number);
    }
}