package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (c == a && b == a) {
            System.out.println(c + " " + a + " " + b);
        } else if (b == c) {
            System.out.println(b + " " + c);
        } else if (c == a) {
            System.out.println(c + " " + a);
        } else if (a == b) {
            System.out.println(a + " " + b);
        }
    }
}