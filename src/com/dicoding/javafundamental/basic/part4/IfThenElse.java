package com.dicoding.javafundamental.basic.part4;

public class IfThenElse {

    public static void main(String[] args) {
        boolean isOn = false;

        if (isOn) {
            System.out.println("Lampu menyala");
            System.out.println("Lampu menyala lain");
        } else
            // Kalau cuman 1 baris bisa gk pake braket
            System.out.println("Kondisi tidak terpenuhi...");
    }
}
