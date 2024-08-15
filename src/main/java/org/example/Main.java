package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Have luck in the bootcamp!");

        String textOfHippHurra = "Hipp, Hipp, Hurra!!";
        // 150 Zeilen Code

        System.out.println(textOfHippHurra.toUpperCase(Locale.ROOT));
        System.out.println(textOfHippHurra);
        System.out.println(textOfHippHurra);

        // primitive Datentypen

        // integer (Zahlen)

        int number = 10;
        int number2 = 12;
        System.out.println(number+number2);

        // integer mit mehreren Stellen

        double numberWithDecimal = 10.123445;
        System.out.println(numberWithDecimal);

        boolean trafficLightIsGreen = false;
        if (trafficLightIsGreen) {
            System.out.println("Traffic light is green");
        } else {
            System.out.println("Traffic light is red");
        }

        byte myNumber = 127;
        System.out.println(myNumber);
        short myBiggerNumber = -32768;
        System.out.println(myBiggerNumber);

        // logical operators

        boolean itIsRainingToday = true;
        boolean itIsRainingTomorrow = false;

        // && operator (true if both vaules are true)
        System.out.println("zwei Tage regen? " + (itIsRainingToday && itIsRainingTomorrow));

        // || operator ( returns true, if one boolean is true
        System.out.println("mindestens ein tag regen? " + (itIsRainingToday || itIsRainingTomorrow));

        // ! "switch" booleans
        System.out.println("Radtour heute möglich?" + (!itIsRainingToday));
    }
}