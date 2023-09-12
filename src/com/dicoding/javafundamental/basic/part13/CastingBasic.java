package com.dicoding.javafundamental.basic.part13;

public class CastingBasic {

    // Saat kita ingin merubah type data 1 ke yang lainnya disebut casting
    public static void main(String[] args) {

        // Cara pertam menggunakan cast
        int a = (int) 3.14;


        System.out.println("Maka akan berubah menjadi int dan nilainya menjadi 3 saja :" + a);

        double b = 3.14;
        String hasil = String.valueOf(b); // Menggunakan value of dari string untuk mengubah type ke string

        System.out.println("Hasolnya : " + hasil);
    }
}
