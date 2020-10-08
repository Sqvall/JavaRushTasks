package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name, address, color;
    int age, weight;

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = null;
        this.color = "gray";
    }

    public Cat(int weight, String color, String address) {
        this.name = null;
        this.age = 2;
        this.address = address;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color) {
        this.name = null;
        this.age = 2;
        this.weight = weight;
        this.address = null;
        this.color = color;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.address = null;
        this.color = "gray";
    }

    public Cat(String name) {
        this.name = name;
        this.address = null;
        this.color = "gray";
        this.age = 2;
        this.weight = 4;
    }

    public static void main(String[] args) {

    }
}
