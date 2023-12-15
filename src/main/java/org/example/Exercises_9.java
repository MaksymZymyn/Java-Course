package org.example;

import java.util.Random;
import java.util.Scanner;

public class Exercises_9 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }

        Random rn3 = new Random();
        int lowerBound = rn3.nextInt(10, 20);
        int highBound = rn3.nextInt(90, 100);
        System.out.println("Enter numbers from " + lowerBound + " till " + highBound);
        for (int i = lowerBound; i < highBound; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number from 1 till 6:");
        int userInput = input.nextInt();
        Random rn = new Random();
        int randomNum = rn.nextInt(1, 7);
        if (userInput == randomNum) {
            System.out.println("You guessed");
            return;
        } else {
            System.out.println("You didn't guess");
        }

        // 2
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the number from 1 till 6:");
        int userInput2 = input2.nextInt();
        Random rn2 = new Random();
        int randomNum2 = rn2.nextInt(1, 7);
        while (true) {
            if (userInput2 == randomNum2) {
                System.out.println("You guessed");
                break;
            } else {
                System.out.println("You didn't guess");
                break;
            }
        }

        // 3
        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter the number from 1 till 6:");

        Random rn4 = new Random();
        int randomNum4 = rn4.nextInt(1, 7);

        while (true) {
            int userInput4 = input4.nextInt();
            if (userInput4 == randomNum4) {
                System.out.println("You guessed");
                break;
            } else {
                System.out.println("You didn't guess");
                // continue;
            }
        }
        System.out.println("Hello World!");
        System.out.println("Hello Max!");
        System.out.println("Hello Maksym!");
        System.out.println("Hello Larisa!");
    }
}
