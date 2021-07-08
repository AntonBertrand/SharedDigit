package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(21, 42));
    }

    public static boolean hasSharedDigit(int num, int numTwo) {

        if (num < 10 || num > 99) {
            return false;
        }

        if (numTwo < 10 || numTwo > 99) {
            return false;
        }

        int one = 0;
        int two = 0;

        one = num % 10;
        two = num / 10;

        int three = 0;
        int four = 0;

        three = numTwo % 10;
        four = numTwo / 10;

        if (one == three || one == four) {
            return true;
        }

        if (two == three || two == four) {
            return true;
        }

        return false;
    }

}
