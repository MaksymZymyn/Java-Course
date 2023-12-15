package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Loops_7 {
    public static void main(String[] args) {
        int n = 10;

        while (n > 0) {
            System.out.println("n = " + n);
            n--;
        }

        int m = 10;

        do {
            System.out.println("m = " + m);
            m--;
        } while (m > 0);

        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }

        String[] str = {"A", "B", "C"};

        // forEach
        for (String s : str) {
            System.out.println(s);
        }

        // for
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        // масив з даними різних типів
        Object[] objects = {1, "d"};
        for (Object o : objects) {
            if (o instanceof Integer) {
                System.out.println("Integer");
            } else if (o instanceof String) {
                System.out.println("String");
            }
        }

        for (Object o : objects) {
            if (o instanceof Integer) {
                System.out.println("Integer");
            }
        }
    }
}
