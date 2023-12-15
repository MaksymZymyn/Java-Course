package org.example;

import java.util.Scanner;

public class Scanner_to_input_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any word: ");
        String input = scanner.nextLine();
        System.out.println(input);

        System.out.println("Enter some words: ");
        String input_until = scanner.next();
        System.out.println(input_until);

        scanner.nextLine();

        System.out.println("Enter any number: ");
        int input2 = scanner.nextInt();
        System.out.println(input2);

        scanner.nextLine();

        System.out.println("Enter any number: ");
        String input_number = scanner.nextLine();
        int number = Integer.valueOf(input_number);
        System.out.println(number);

        System.out.println("Enter any boolean: ");
        boolean input_bool = scanner.nextBoolean();
        // scanner.hasNext();
        System.out.println(input_bool);

        scanner.nextLine();

        System.out.println("Enter any float: ");
        float input_float = scanner.nextFloat();
        System.out.println(input_float);
    }
}