package org.beecrowd;



//Read an integer N (2 < N < 1000). Print the multiplication table of N.
//        1 x N = N      2 x N = 2N        ...       10 x N = 10N
//        Input
//
//        The input is an integer N (1 < N < 1000).
//        Output
//
//        Print the multiplication table of N., like the following example.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%s x %s = %s\n", i, N, (i * N));
//            System.out.println(i + " x " + N + " = " + (i * N));
        }
    }
}
