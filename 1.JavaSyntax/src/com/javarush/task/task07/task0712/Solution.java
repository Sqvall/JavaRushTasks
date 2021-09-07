package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые-самые
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        String maxString = strings.get(0);
        int maxStringIndex = 0;
        String minString = strings.get(0);
        int minStringIndex = 0;

        for (int i = 0; i < strings.size(); i++) {
            int len = strings.get(i).length();
            if (maxString.length() < len) {
                maxString = strings.get(i);
                maxStringIndex = i;
            }
            if (minString.length() > len) {
                minString = strings.get(i);
                minStringIndex = i;
            }
        }
        if (minStringIndex < maxStringIndex) {
            System.out.println(minString);
        } else {
            System.out.println(maxString);
        }
    }
}
