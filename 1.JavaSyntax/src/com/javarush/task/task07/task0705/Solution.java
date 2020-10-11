package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr1 = new int[20];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 10; i++) {
            arr2[i] = arr1[i];
            arr3[i] = arr1[i + 10];
        }
        for (int i : arr3) {
            System.out.println(i);
        }
    }
}
