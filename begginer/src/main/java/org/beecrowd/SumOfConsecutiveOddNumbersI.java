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

        var min = Math.min(x, y) + 1;
        var max =  Math.max(x, y);

        for (int i = min; i < max; i++){

            if(i % 2 != 0){
                sum = sum + i;
            }
        }

        System.out.println(sum);

    }
}
