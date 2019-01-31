package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int x = 1 + r.nextInt(10);
            System.out.println(x);
        }
        int num1 = 1 + r.nextInt(10);
        int num2 = 1 + r.nextInt(10);

        if (num1 == num2) {
            System.out.println("The random numbers were the same! Weird.");
        }
        if (num1 != num2) {
            System.out.println("The random numbers were different! Not too surprising, actually.");
        }
    }
}

