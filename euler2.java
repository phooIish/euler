package com.company;

public class euler2 {
    public static void main(String[] args) {
        euler2(fibonacci(50));
    }
    static int[] fibonacci(int n) {
        int num1 = 0, num2 = 1, temp;
        int[] fib = new int[n];
        for (int i = 0; i < n; i++) {
            temp = num2;
            num2 += num1;
            num1 = temp;
            if(num2 > 0){ //Only adds the positive values into an array
                fib[i] = num2;
            }
            else {break;}
        }
        return fib;
    }

    static void euler2(int[] array) { //Collects the sum of the even values that do not exceed four million
        int evens = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 4000000){
                if (array[i] % 2 == 0) {
                    evens += array[i];
                }
            }
        }
        System.out.println("Sum of the even values = " + evens);
    }
}
