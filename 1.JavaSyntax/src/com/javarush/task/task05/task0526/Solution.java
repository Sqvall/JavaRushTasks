package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("man", 22, "address");
        Man man2 = new Man("man", 22, "address");
        Woman woman1 = new Woman("woman", 18, "address");
        Woman woman2 = new Woman("woman", 18, "address");
        System.out.println(man1);
        System.out.println(woman2);
    }

    public static class Man {
        String name, address;
        int age;

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }

        Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
//        name + " " + age + " " + address
    }
    public static class Woman {
        String name, address;
        int age;

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }

        Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
