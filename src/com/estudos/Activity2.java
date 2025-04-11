package com.estudos;

import java.util.Scanner;

public class Activity2 {
    public static void activity2(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Principal (R$1K - R$1M): ");
            double principal = scanner.nextDouble();
            if (principal < 1000 || principal > 1_000_000) {
                System.out.println("Invalid: type between R$1.000 and R$1.000.000.");
                continue;
            }

            System.out.print("Annual Interest Rate: ");
            float annual = scanner.nextFloat();
            if (annual <= 0 || annual > 30) {
                System.out.println("Invalid: type between 0% and 30%.");
                continue;
            }

            System.out.print("Period (years): ");
            int years = scanner.nextInt();
            if (years < 1 || years > 30) {
                System.out.println("Invalid: type between 1 and 30.");
                continue;
            }

            break;

        }

    }
}
