package org.beecrowd;

//Read an integer N. Print the square of each one of the even values from 1 to N including N if it is the case.
//        Input
//
//        The input contains an integer N (5 < N < 2000).
//        Output
//
//        Print the square of each one of the even values from 1 to N, as the given example.
//
//        Be carefull! Some language automaticly print 1e+006 instead 1000000.
//        Please configure your program to print the correct format setting the output precision.

import java.util.Scanner;

public class EvenSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = scanner.nextInt();

        for (int i = 2; i <= N; i+=2){
            System.out.println(i + "^2 = " + (int) Math.pow(i, 2));
        }
    }
}
