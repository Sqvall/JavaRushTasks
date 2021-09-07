package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        String grandMotherName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();

        Cat grandFather = new Cat (grandFatherName);
        Cat grandMother = new Cat (grandMotherName);
        Cat father = new Cat (fatherName,null, grandFather);
        Cat mother = new Cat (motherName, grandMother,null);
        Cat son = new Cat (sonName, mother, father);
        Cat daughter = new Cat (daughterName, mother, father);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String s = "The cat's name is " + name + ", ";
            if (mother == null) {
                s += "no mother, ";
            } else {
                s += "mother is " + mother.name + ", ";
            }
            if (father == null) {
                s += "no father";
            } else {
                s += "father is " + father.name;
            }
            return s;
        }
    }

}
