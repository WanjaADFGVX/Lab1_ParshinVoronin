package ru.mirea.gibo03.lab1;
import java.lang.System;

public class TestDog {
    public static void main(String[] args) {

        Dog d1 = new Dog("Bobik", 2);
        Dog d2 = new Dog("Sharik", 7);
        Dog d3 = new Dog("Muhtar");

        d3.setAge(1);

        System.out.println(d1);

        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
