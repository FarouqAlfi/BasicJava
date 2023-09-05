package com.dicoding.javafundamental.basic.part4;

public class ForBersarang {

    public static void main(String[] args) {
        int a = 5;

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println("");
        }
    }
}
