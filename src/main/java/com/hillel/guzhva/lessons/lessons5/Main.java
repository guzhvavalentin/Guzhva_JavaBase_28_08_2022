package com.hillel.guzhva.lessons.lessons5;

public class Main {
    public static void main(String[] args) {

        int gamer1 = 9;
        int gamer2 = 9;
        int gamer3 = 10;
        int gamer4 = 11;
        int gamer5 = 11;
        final int a = 5;
        int result1 = (gamer1+gamer2+gamer3+gamer4+gamer5) / a;


        int shooter1 = 4;
        int shooter2 = 8;
        int shooter3 = 7;
        int shooter4 = 3;
        int shooter5 = 4;
        int result2 = (shooter1+shooter2+shooter3+shooter4+shooter5) / a;

        if (result1 > result2){
            System.out.println("Пбедила команда Black! Набрала "+ result1 + " очков");
        } else if (result1 < result2) {
            System.out.println("Победила команда: White! Набрала " + result2 + " очков");
        }







    }
}
