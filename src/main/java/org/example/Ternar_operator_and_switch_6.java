package org.example;

import java.util.Scanner;

public class Ternar_operator_and_switch_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = scanner.nextInt();

        boolean result = (age > 18) ? true : false;
        System.out.println(result);

        String result2 = (age > 18) ? "You can drink the beer" : "You can't drink the beer yet";
        System.out.println(result2);

        System.out.println(age > 18 ? "You can drink the beer" : "You can't drink the beer yet");

        switch (age) {
            case 18:
                System.out.println("You can drink the beer");
                break; // return; - exit the program
            case 15:
                System.out.println("You can't drink the beer yet");
                break;
            default:
                System.out.println("I don't have the answer for you");
        }

        switch (age) {
            case 18: { // I can use {}
                System.out.println("You can drink the beer");
                break; // return; - exit the program
            }
            case 15: {
                System.out.println("You can't drink the beer yet");
                break;
            }
            default: {
                System.out.println("I don't have the answer for you");
            }
        }
    }
}
