package com.company;

import javafx.scene.shape.Circle;

import java.util.*;

public class Chapter13 {
    public static void main(String[] args) {
//        chapter13_2();
        chapter13_6();
    }

    public static void chapter13_2() {
        int[] numArray = new int[100];
        for (int i = 0;i<10;i++) {
            numArray[i] = i;
        }

        shuffle(numArray);
        for (int i = 0;i<10;i++) {
            System.out.println(numArray[i]);
        }
    }

    public static void shuffle(int[] arrayList) {
        for (int i = 9;i>0;i--) {
            int k = (int)(Math.random()*(i-1));
            int temp = arrayList[k];
            arrayList[k] = arrayList[i];
            arrayList[i] = temp;
        }

    }

    public static void chapter13_6() {
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(2);
        System.out.println(circle1.compareTo(circle2));
    }
}

class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    ComparableCircle(double radius) {
        this.setRadius(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius()>o.getRadius()) {
            return 1;
        } else {
            return 0;
        }
    }
}


