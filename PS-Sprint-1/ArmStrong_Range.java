package com.sprint1;

public class ArmStrong_Range {
    public static void main(String[] args) {
        int num = 500;
        boolean first = true;

        System.out.print("[");

        for (int i = 1; i <= num; i++) {
            int temp = i;
            int count = String.valueOf(i).length();
            double sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, count);
                temp = temp / 10;
            }

            if (sum == i) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }

        System.out.println("]");
    }
}
