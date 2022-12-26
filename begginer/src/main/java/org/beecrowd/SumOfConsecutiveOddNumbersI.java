package org.beecrowd;


//
//Read two integer values X and Y. Print the sum of all odd values between them.
//        Input
//
//        The input file contain two integer values.
//        Output
//
//        The program must print an integer number.
//        This number is the sum off all odd values between both input values that must fit in an integer number.

import java.util.Scanner;

public class SumOfConsecutiveOddNumbersI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var x = scanner.nextInt();
        var y = scanner.nextInt();

        int sum = 0;

        for (int i = Math.min(x, y) + 1; i < Math.max(x, y); i++){

            if(i % 2 != 0){
                sum = sum + i;
            }
        }

        System.out.println(sum);

    }
}
