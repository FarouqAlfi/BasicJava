package com.dicoding.javafundamental.basic.dto;

public class KucingAnggora {

    String namaKucing;

    int beratBadan;

    // Constructor
    // Non-Argument Constructor
//    public KucingAnggora() {
//
//    }

    public static void main(String[] args) {
        cobaFungsi();
    }

    public static void cobaFungsi() {
        System.out.println("Ini murupakan bagian dari fungsi");
    }

    // Parameterized Constructor
    // Menambahkan parameter untuk properti / key class kita
    public KucingAnggora(String nama) {
        this.namaKucing = nama;
    }

    public void beratKucing(int berat) {
        this.beratBadan = berat;
    }

    public void cetakNama(String name) {
        System.out.println("Nama kucingnya : " + name);
    }
}
