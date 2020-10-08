package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int point = 0;
        int anotherPoint = 0;

        if (this.age > anotherCat.age) {
            point++;
        } else if (this.age < anotherCat.age) {
            anotherPoint++;
        }
        if (this.weight > anotherCat.weight) {
            point++;
        } else if (this.weight < anotherCat.weight) {
            anotherPoint++;
        }
        if (this.strength > anotherCat.strength) {
            point++;
        } else if (this.strength < anotherCat.strength) {
            anotherPoint++;
        }

        return point > anotherPoint;

    }

    public static void main(String[] args) {

    }
}
