package ru.mirea.gibo03.lab1;
import java.lang.System;

public class TestBall {
    public static void main(String[] args) {

        Ball b1 = new Ball("Green", 10);
        Ball b2 = new Ball("Blue", 20);
        Ball b3 = new Ball("Red");

        b3.setRadius(5);

        System.out.println(b1);

        b1.volumeOfBall();
        b2.volumeOfBall();
        b3.volumeOfBall();
    }
}
