package com.hillel.guzhva.lessons.lessons5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("����� �������� ������ �������");
        String black = scanner.nextLine();
        System.out.println(black);

        System.out.println("����� ���������� ����� ������ 1 ������ �������");
        int player1 = 0;
        if (scanner.hasNextInt()) {
            player1 = scanner.nextInt();
            System.out.println(player1);
        } else {
            System.out.println("������ �� ������ ������");
            System.exit(0);
        }

        System.out.println("����� ���������� ����� ������ 2 ������ �������");
        int player2 = 0;
        if (scanner.hasNextInt()) {
            player2 = scanner.nextInt();
            System.out.println(player2);
        } else {
            System.out.println("������ �� ������ ������");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("����� ���������� ����� ������ 3 ������ �������");
        int player3 = 0;
        if (scanner.hasNextInt()) {
            player3 = scanner.nextInt();
            System.out.println(player3);
        } else {
            System.out.println("������ �� ������ ������");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("����� ���������� ����� ������ 4 ������ �������");
        int player4 = 0;
        if (scanner.hasNextInt()) {
            player4 = scanner.nextInt();
            System.out.println(player4);
        } else {
            System.out.println("������ �� ������ ������");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("����� ���������� ����� ������ 5 ������ �������");
        int player5 = 0;
        if (scanner.hasNextInt()) {
            player5 = scanner.nextInt();
            System.out.println(player5);
        } else {
            System.out.println("������ �� ������ ������");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("����� �������� ������ �������");
        String white = scanner.nextLine();
        System.out.println(black);

        System.out.println("����� ���������� ����� ������ 1 ������ �������");
        int player6 = 0;
        if (scanner.hasNextInt()) {
            player6 = scanner.nextInt();
            System.out.println(player6);
        } else {
            System.out.println("������ �� ������ ������");
            System.exit(0);
        }

        System.out.println("����� ���������� ����� ������ 2 ������ �������");
        int player7 = 0;
        if (scanner.hasNextInt()) {
            player7 = scanner.nextInt();
            System.out.println(player7);
        } else {
            System.out.println("������ �� ������ ������");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("����� ���������� ����� ������ 3 ������ �������");
        int player8 = 0;
        if (scanner.hasNextInt()) {
            player8 = scanner.nextInt();
            System.out.println(player8);
        } else {
            System.out.println("������ �� ������ ������");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("����� ���������� ����� ������ 4 ������ �������");
        int player9 = 0;
        if (scanner.hasNextInt()) {
            player9 = scanner.nextInt();
            System.out.println(player9);
        } else {
            System.out.println("������ �� ������ ������");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("����� ���������� ����� ������ 5 ������ �������");
        int player10 = 0;
        if (scanner.hasNextInt()) {
            player10 = scanner.nextInt();
            System.out.println(player10);
        } else {
            System.out.println("������ �� ������ ������");
            System.exit(0);
        }
        scanner.nextLine();

        String team1 = "Black";
        double result = (player1 + player2 + player3 +player4 + player5) / 5;

        String team2 = "White";
        double result2 = (player6 + player7 + player8 +player9 + player10) / 5;

        if (result > result2) {
            System.out.println("�������� ������� " + team1 + " ������� " + result + " �����" );
        } else if (result < result2) {
            System.out.println("�������� ������� " + team2 + " ������� " + result2 + " �����" );
        } else if (result == result2) {
            System.out.println("�����");
        }


    }

}
