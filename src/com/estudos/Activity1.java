package com.estudos;

import java.util.Scanner;

public class Activity1 {
    public static void activity1(String[] args) {
        //Activity 1:

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = Scanner.nextInt();

        if (num % 5 == 0 && num % 3 == 0)
            System.out.println("FizzBuzz");
        else if (num % 5 == 0)
            System.out.println("Fizz");
        else if (num % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(num);

    }
}