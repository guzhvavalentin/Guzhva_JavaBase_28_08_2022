package com.hillel.guzhva.lessons.lessons5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String team = "Black";
        int gamer1 = 9;
        int gamer2 = 9;
        int gamer3 = 10;
        int gamer4 = 11;
        int gamer5 = 11;
        final int a = 5;
        int result1 = (gamer1 + gamer2 + gamer3 + gamer4 + gamer5) / a;

        String team2 = "White";
        int gamer6 = 4;
        int gamer7 = 8;
        int gamer8 = 7;
        int gamer9 = 3;
        int gamer10 = 4;
        int result2 = (gamer6 + gamer7 + gamer8 + gamer9 + gamer10) / a;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Кто победил?:");
        String value = scanner.nextLine();
        System.out.println(value);


        if (result1 > result2) {
            System.out.println("Пбедила команда " + team + " с результатом " + result1 + " очков");
        } else if (result1 < result2) {
            System.out.println("Победила команда " + team2 + " с результатом " + result2 + " очков");

        }

    }
}
