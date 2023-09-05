package com.dicoding.javafundamental.basic.part2;

public class Scanner {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Program penjumlahan sederhana");

        System.out.print("Masukan angka pertama :");

        int value = scanner.nextInt();

        System.out.print("Masukan angka kedua :");

        int value2 = scanner.nextInt();

        int hasil = value + value2;

        System.out.println("Hasilnya adalah : " + hasil);
    }
}
