package com.hillel.guzhva.lessons.lessons2;

public class Main {
    public static void main(String[] args){

        System.out.println("45°18'31\" s.l. 36°30'22\" e.l.");

        System.out.println();

        int latitude = 45;
        char degree = '\u00B0';

        int latitude2 = 18;
        char quotationMark = '\'';

        int latitude3 = 31;
        char quote = '\u0022';

        char north = 's';
        char dot = '\u002E';

        char latitude4 = 'l';
        char dot2 = '\u002E';


        int longitude = 36;
        char degree2 = '\u00B0';

        int longitude2 = 30;
        char quotationMark2 = '\'';

        int longitude3 = 22;
        char quote2 = '\u0022';

        char longitude4 = 'e';
        char dot3 = '\u002E';

        char longitude5 = 'l';
        char dot4 = '\u002E';


        System.out.println(latitude + "" + degree + latitude2 + quotationMark + latitude3 + quote + " " + north + dot + latitude4 + dot2 + " " + longitude + "" + degree2 + longitude2 + quotationMark2 + longitude3 + quote2 + " " + longitude4 + dot3 + longitude5 + dot4);
    }
}
