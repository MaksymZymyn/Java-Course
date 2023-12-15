package org.example;

import java.util.Random;

public class Random_numbers_8 {
    public static void main(String[] args) {
        double random = Math.random();  // [0, 1)
        // Math.random() * (b - a) + a

        double random2 = Math.random() * 3;  // [0, 3)
        // Math.random() * (b - a) + a, a = 0, b = 3

        double random3 = Math.random() * 2 + 1;  // [1, 3)
        // Math.random() * (b - a) + a, a = 1, b = 3

        double random4 = Math.random() + 2;  // [2, 3)
        // Math.random() * (b - a) + a, a = 2, b = 3

        int random5 = (int) Math.random() * 2;   // 0
        System.out.println(random5);

        int random6 = (int) (Math.random() * 3);   // [0, 2]
        System.out.println(random6);

        int random7 = (int) (Math.random() * 20) + 1;   // [1, 20]
        System.out.println(random7);

        Random rn = new Random();
        System.out.println(rn.nextInt());

        Random rn2 = new Random();
        System.out.println(rn2.nextInt(100) + 1);   // [1, 100]

        Random rn3 = new Random();
        System.out.println(rn3.nextInt(10) + 90);   // [90, 99]

        // 1
        int maximum = 20;
        int minimum = 10;
        Random rn4 = new Random();
        int range = maximum - minimum + 1;
        int randomNum = rn.nextInt(range) + minimum;  // [10, 20]
        System.out.println(randomNum);

        // 2
        int randomNum2 = rn.nextInt(10, 20);   // [10, 19]
        System.out.println(randomNum2);

        int randomNum3 = rn.nextInt(15, 21 + 1);   // [15, 21]
        System.out.println(randomNum3);
        int randomNum4 = rn.nextInt(15, 22);   // [15, 21]
        System.out.println(randomNum4);
    }
}

