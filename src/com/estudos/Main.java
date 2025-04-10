package com.estudos;

import java.text.NumberFormat;
import java.util.Scanner;

//info: .trim() can remove the unnecessary spaces
//      sout = type the command System.out.println()
//      \n = broken line
//      \t = tab line
//      sort command "Arrays.sort" can organize the numbers in ascending order
//      if you need to declare a constant variable use "final" and the name of the variable in CAPSLOCK
//      implicit casting order: byte > short > int > long > float > double Ex.: you can add a byte to a double (implicit conversion), but not the opposite.
//      you can convert a string to a int: "string x = "1"" -> "int y = Integer.parseInt(x)"
public class Main {
    public static void main(String[] args) {

        Scanner P = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = P.nextDouble();

        Scanner R = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        double annual = R.nextDouble();

        Scanner y = new Scanner(System.in);
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