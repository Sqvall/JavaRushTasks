package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        int len = list.size();
        for (int i = 0; i < len * 2; i += 2) {
            list.add(i + 1, "именно");
        }
        list.forEach(System.out::println);
    }
}
