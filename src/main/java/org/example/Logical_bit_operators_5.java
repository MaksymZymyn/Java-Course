package org.example;

public class Logical_bit_operators_5 {

    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;
        boolean result = isTrue && isFalse;
        System.out.println(result);

        boolean result2 = isTrue || isFalse;
        System.out.println(result2);

        boolean result3 = !isFalse;
        System.out.println(result3);

        int a = 5; // 0101
        int b = 3; // 0011
        int result4 = a | b; // 0111, equals 7
        System.out.println(result4);

        int result5 = a & b; // 0001, equals 1
        System.out.println(result5);

        int result6 = a ^ b; // 0110, equals 6
        System.out.println(result6);

        int result7 = ~a; // 1010, equals -6
        System.out.println(result7);
    }
}
