package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int prevCharCount = 0;
        for (String s : list) {
            if (prevCharCount < s.length()) {
                prevCharCount = s.length();
            } else {
                System.out.println(list.indexOf(s));
                break;
            }
        }
    }
}

