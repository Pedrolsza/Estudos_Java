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
//      you can't use this != in strings you need to use .equals. Ex.: "while (input != "quit")" this is wrong. "while (!input.equals("quit))" this is correct
//      its better to use the new Scanner outside the loop
//      if you have a break in your loop, you can use while(true)
public class Main {
    public static void main(String[] args) {
        //Activity.activity(new String[]{});
        //Activity1.activity1(new String[]{});
        Activity2.activity2(new String[]{});
    }
}