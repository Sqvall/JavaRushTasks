package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); ) {
            String s = strings.get(i);
            if (s.contains("р") && s.contains("л")) {
                i++;
                continue;
            }
            else if (strings.get(i).contains("р")) {
                strings.remove(i);
                continue;
            }
            else if (strings.get(i).contains("л")){
                strings.add(i + 1, s);
                i++;
            }
            i++;
        }
        return strings;
    }
}