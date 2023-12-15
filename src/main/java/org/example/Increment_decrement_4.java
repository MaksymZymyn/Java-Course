package org.example;

import java.util.Scanner;

public class Increment_decrement_4 {

    public static void main(String[] args) {
        int result = 0;
        System.out.println(result++); // 0
        System.out.println(result);   // 1
        int result3 = 0;
        System.out.println(++result3); // 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = scanner.nextInt();

        if (age > 18) {
            System.out.println("You can drink the beer");
            int result2 = 10;
            result2++; // result = result + 1;
            ++result2;
            result2 += age;  // result = result + age;
            result2--; // result = result - 1;
            --result2;
        } else if (age == 16) {
            System.out.println("You are 16 years old");
        } else {
            System.out.println("You can't drink the beer yet");
        }
    }
}
