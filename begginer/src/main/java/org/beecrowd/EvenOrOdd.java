package org.beecrowd;

import java.util.Scanner;

//Read an integer value N. After, read these N values and print a message for each value saying if this
// value is odd, even, positive or negative. In case of zero (0), although the correct description would be "EVEN NULL",
// because by definition zero is even, your program must print only "NULL", without quotes.
//        Input
//
//        The first line of input is an integer N (N < 10000), that indicates the total number of test cases.
//        Each case is a integer number X (-107 < X <107)..
//        Output
//
//        For each test case, print a corresponding message, according to the below example.
//        All messages must be printed in uppercase letters and always will have one space between two words in the same line.
public class EvenOrOdd {

    public static void main(String[] args) {
         final Scanner scanner = new Scanner(System.in);

         final var N = scanner.nextInt();
         final var numbers = new int[N];

         for(int i = 0; i < N; i++){
             numbers[i] = scanner.nextInt();
        }

         for(int i = 0; i < numbers.length; i++){
             if (numbers[i] == 0){
                 System.out.println("NULL");
             }else if(numbers[i] % 2 == 0){
                 if(numbers[i] > 0){
                     System.out.println("EVEN POSITIVE");
                 }else{
                     System.out.println("EVEN NEGATIVE");
                 }
             }else{
                 if(numbers[i] > 0){
                     System.out.println("ODD POSITIVE");
                 }else{
                     System.out.println("ODD NEGATIVE");
                 }
             }
         }
    }
}
