package org.beecrowd;



//Read an integer N. Print all numbers between 1 and 10000, which divided by N will give the rest = 2.
//        Input
//
//        The input is an integer N (N < 10000)
//        Output
//
//        Print all numbers between 1 and 10000, which divided by n will give the rest = 2, one per line.

import java.util.Scanner;

public class Remaining2 {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final var N = scanner.nextInt();

        for(int i = 0; i < 10000; i++){
            if(i % N == 2){
                System.out.println(i);
            }
        }
    }
}
