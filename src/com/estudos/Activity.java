package com.estudos;

import java.text.NumberFormat;
import java.util.Scanner;

public class Activity {
    public static void activity(String[] args) {
        //Activity :

        Scanner P = new Scanner(System.in);             // It's better to declare a single Scanner at the beginning and reuse it
        System.out.print("Principal: ");                // Ex. when reuse:"double principal = P.nextDouble();" by "int principal = scanner.nextInt();;
        double principal = P.nextDouble();

        Scanner R = new Scanner(System.in);             // Avoid creating multiple Scanner objects; reuse a single instance

        System.out.print("Annual Interest Rate: ");
        double annual = R.nextDouble();

        Scanner y = new Scanner(System.in);             // Avoid creating multiple Scanner objects; reuse a single instance
        System.out.print("Period (years): ");
        int years = y.nextInt();

        double r = annual/100/12;
        double n = years * 12;
        double x = Math.pow(1 + r, n);

        double M = principal * ((r * x) / (x - 1));

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: " + currency.format(M));

    }
}