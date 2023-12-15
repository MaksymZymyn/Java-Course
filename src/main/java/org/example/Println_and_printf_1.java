package org.example;

public class Println_and_printf_1 {

    public static void main(String[] args) {
        System.out.println("Hello \n World!");
        System.out.print("Hello World!\n");

        int x = 8;
        int y = 10;
        System.out.println("x = " + x + ". y = " + y);
        System.out.printf("x = %d. y = %d\n", x, y);
        System.out.printf("x = %d. y = %d\n", y, x);   // insert values by turn

        double d = 1.6;
        System.out.printf("d = %f\n", d);

        char c = 'f';
        System.out.printf("c = %c\n", c);
    }
}






