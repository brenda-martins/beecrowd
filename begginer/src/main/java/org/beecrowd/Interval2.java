package org.beecrowd;

//Read an integer N. This N will be the number of integer numbers X that will be read.
//
//        Print how many these numbers X are in the interval [10,20] and how many values are out of this interval.
//         
//        Input
//
//        The first line of input is an integer N (N < 10000), that indicates the total number of test cases.
//        Each case is an integer number X (-107 < X < 107).
//
//         
//        Output
//
//        For each test case, print how many numbers are in and how many values are out of the interval.

import java.util.Scanner;

public class Interval2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = scanner.nextInt();
        int countIn = 0;
        int countOut = 0;

        while(N > 0){
            var x = scanner.nextInt();

            if(x >= 10 && x <= 20){
                countIn++;
            }else{
                countOut++;
            }

            N--;
        }

        System.out.println(countIn + " in");
        System.out.println(countOut + " out");
    }
}
