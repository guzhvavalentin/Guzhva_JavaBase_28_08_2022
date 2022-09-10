package com.hillel.guzhva.lessons.lessons4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Li");

        int warrior = 13;
        int archer = 24;
        int rider = 46;

        int li = (warrior + archer + rider) * 860;
        System.out.println(li);

        System.out.println();

        System.out.println("Min");

        int warrior2 = 9;
        int archer2 = 35;
        int rider2 = 12;

        int min = (warrior2 + archer2 + rider2) *860;
        double min2 = min *1.5;

        System.out.println((int)min2);

    }
}
