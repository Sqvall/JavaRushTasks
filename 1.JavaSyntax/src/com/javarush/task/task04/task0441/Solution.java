package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> lst = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            int nmb = Integer.parseInt(reader.readLine());
            lst.add(nmb);
        }
        Collections.sort(lst);
        System.out.println(lst.get(lst.size() / 2));
    }
}
