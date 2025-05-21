package com.sprint1;

public class Sum_of_Digits_Until_Single_Unit {

    public static void main(String[] args) {
        int num = 9875;
        
        while (num >= 10) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        System.out.println(num);
    }
}
