package org.example;

import java.util.Scanner;

public class Ifelseifelse_Debugger_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = scanner.nextInt();

        if (age > 18) {
            System.out.println("You can drink the beer");
        } else {
            System.out.println("You can't drink the beer yet");
        }

        if (age > 18) {
            System.out.println("You can drink the beer");
        } else if (age == 16) {
            System.out.println("You are 16 years old");
        } else {
            System.out.println("You can't drink the beer yet");
        }

        // Debugger
        if (age > 18) {
            System.out.println("You can drink the beer");
            int result = age / 0;
        } else if (age == 16) {
            System.out.println("You are 16 years old");
        } else {
            System.out.println("You can't drink the beer yet");
        }

        int a = Integer.MAX_VALUE;
        System.out.println(a);     // 2147483647
    }
}