package com.hillel.guzhva.lessons.lessons5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи название первой команды");
        String black = scanner.nextLine();
        System.out.println(black);

        System.out.println("введи количество очков игрока 1 первой команды");
        if (scanner.hasNextInt()) {
            int player1 = scanner.nextInt();
            System.out.println(player1);
        } else {
            System.out.println("ведены не верные данные");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("введи количество очков игрока 2 первой команды");
        if (scanner.hasNextInt()) {
            int player2 = scanner.nextInt();
            System.out.println(player2);
        } else {
            System.out.println("ведены не верные данные");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("введи количество очков игрока 3 первой команды");
        if (scanner.hasNextInt()) {
            int player3 = scanner.nextInt();
            System.out.println(player3);
        } else {
            System.out.println("ведены не верные данные");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("введи количество очков игрока 4 первой команды");
        if (scanner.hasNextInt()) {
            int player4= scanner.nextInt();
            System.out.println(player4);
        } else {
            System.out.println("ведены не верные данные");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("введи количество очков игрока 5 первой команды");
        if (scanner.hasNextInt()) {
            int player5= scanner.nextInt();
            System.out.println(player5);
        } else {
            System.out.println("ведены не верные данные");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Введи название второй команды");
        String white = scanner.nextLine();
        System.out.println(white);


        System.out.println("введи количество очков игрока 1 второй команды");
        if (scanner.hasNextInt()) {
            int player6= scanner.nextInt();
            System.out.println(player6);
        } else {
            System.out.println("ведены не верные данные");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("введи количество очков игрока 2 второй команды");
        if (scanner.hasNextInt()) {
            int player7= scanner.nextInt();
            System.out.println(player7);
        } else {
            System.out.println("ведены не верные данные");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("введи количество очков игрока 3 второй команды");
        if (scanner.hasNextInt()) {
            int player8= scanner.nextInt();
            System.out.println(player8);
        } else {
            System.out.println("ведены не верные данные");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("введи количество очков игрока 4 второй команды");
        if (scanner.hasNextInt()) {
            int player9= scanner.nextInt();
            System.out.println(player9);
        } else {
            System.out.println("ведены не верные данные");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("введи количество очков игрока 5 второй команды");
        if (scanner.hasNextInt()) {
            int player10= scanner.nextInt();
            System.out.println(player10);
        } else {
            System.out.println("ведены не верные данные");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println();

        String team = "Black";
        int player1 = 9;
        int player2 = 9;
        int player3 = 10;
        int player4 = 11;
        int player5 = 11;

        final int a = 5;
        int result1 = (player1 + player2 + player3 + player4 + player5) / a;

        String team2 = "White";
        int player6 = 4;
        int player7 = 8;
        int player8 = 7;
        int player9 = 3;
        int player10 = 14;
        int result2 = (player6 + player7 + player8 + player9 + player10) / a;

        if (result1 > result2) {
            System.out.println("Победила команда " + team + " набрала " + result1 + " очков");
        } else if (result1 < result2) {
            System.out.println("Победила команда " + team2 + " набрала " + result2 + " очков");
        }









    }

}
