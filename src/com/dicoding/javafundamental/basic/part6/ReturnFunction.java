package com.dicoding.javafundamental.basic.part6;

public class ReturnFunction {

    public static void main(String[] args) {
        double value = 5;
        double anotherValue = 6.5;

        double hasil = hitungLuas(value, anotherValue); // Memanggil Fungsi

        System.out.println("Hasilnya : " + hasil);
    }

    // Fungsi dengan nilai balik
    public static double hitungLuas(double p, double l) {

        return p * l;
    }
}
