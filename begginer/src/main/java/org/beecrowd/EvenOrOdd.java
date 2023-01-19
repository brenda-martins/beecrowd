package org.beecrowd;

import java.util.Scanner;

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
