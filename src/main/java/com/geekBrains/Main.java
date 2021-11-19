package com.geekBrains;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSigs();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSigs() {
        int a = 1;
        int b = 2;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        int value = 3;{
            if (value < 0) {
                System.out.println("Red");
            }else if
            (value >= 0 && value<=100) {
                System.out.println("Green");
            }
        }

    }

    private static void compareNumbers() {
        int a = 4;
        int b = 5;
        if (a >= b ) {
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }
    }
}
