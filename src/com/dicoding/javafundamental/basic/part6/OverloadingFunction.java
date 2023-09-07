package com.dicoding.javafundamental.basic.part6;

public class OverloadingFunction {

    public static void main(String[] args) {
        double value = 5.5;
        double anotherValue = 6;
        double hasil = luasPersegi(value, anotherValue);

        System.out.println("Hasil double : " + hasil);

        int value2 = 5;
        int anotherValue2 = 6;
        int hasil2 = luasPersegi(value2, anotherValue2);

        System.out.println("Hasil int : " + hasil2






        );
    }

    // Overloading method bisa menggunakan nama method yang sama tapi paramaternya harus beda
    public static double luasPersegi(double p, double l) {
        double luas = p * l;

        return luas;
    }

    public static int luasPersegi(int p, int l) {
        int luas = p * l;

        return luas;
    }
}
