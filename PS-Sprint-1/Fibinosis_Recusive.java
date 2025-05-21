package com.sprint1;

public class Fibinosis_Recusive {
    public static void main(String[] args) {
        int num = 5;
        int a = 0;
        int b = 1;

        printFibonacci(a, b, num);
    }

    static void printFibonacci(int a, int b, int num) {
        if (a >= num)
            return;

        System.out.println(a + " ");
        int next = a + b;
        printFibonacci(b, next, num);
    }
}
