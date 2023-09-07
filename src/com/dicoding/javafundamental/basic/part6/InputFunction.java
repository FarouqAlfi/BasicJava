package com.dicoding.javafundamental.basic.part6;

public class InputFunction {

    public static void main(String[] args) {
        // Memanggil Fungsi
        luasPersegi(5.5, 9.5);
    }

    // Karena tidak membalikan nilai maka type nya void
    public static void luasPersegi(double p, double l) {
        double hasil = p * l;

        System.out.println("Hasilnya : " + hasil);
    }
}
