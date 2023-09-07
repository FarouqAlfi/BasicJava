package com.dicoding.javafundamental.basic.part7;

// Kalau mau class implements dari interface menjadi abstrack class cukup tambahkan abstrak saja sebelum class
public class Kucing implements Hewan {

    @Override
    public void makan() {
        System.out.println("Kucing sedang makan...");
    }
}
