package com.dicoding.javafundamental.basic.part1;

public class OperatorEquality {

    public static void main(String[] args) {

        System.out.println("Sama dengan..");

        int value = 5;
        int anotherValue = 4;

        boolean result;

        result = value == anotherValue;

        System.out.println("Hasil value == anotherValue adalah " + result);
        System.out.println();

        System.out.println("Tidak sama dengan..");

        result = value != anotherValue;

        System.out.println("Hasil value != anotherValue adalah " + result);
        System.out.println();

        System.out.println("lebih besar dari..");

        result = value > anotherValue;

        System.out.println("Hasil value > anotherValue adalah " + result);
        System.out.println();

        System.out.println("sama atau lebih besar dari..");

        result = value >= anotherValue;

        System.out.println("Hasil value >= anotherValue adalah " + result);
        System.out.println();

        System.out.println("kurang dari..");

        result = value < anotherValue;

        System.out.println("Hasil value < anotherValue adalah " + result);
        System.out.println();

        System.out.println("sama atau kurang dari..");

        result = value <= anotherValue;

        System.out.println("Hasil value <= anotherValue adalah " + result);
        System.out.println();
    }
}
