package com.dicoding.javafundamental.basic.part6;

public class PropertieHewan {

    // Properti / field
    String name;

    // Properti / field yang sudah di inisiasi dengan beri nilai inisial
    int age = 19;

    // Properti / field inisiasi melalui konstruktor
    int berat;

    public PropertieHewan(int berat) {
        this.berat = berat;
    }


    // Method Void
    public void jalan() {
        System.out.println("Hewan sedang berjalan...");
    }

    public void lari() {
        System.out.println("Hewan sedang berlari...");
    }

    public void makan() {
        System.out.println("Hewan sedang makan...");
    }


    // Method Fungsi
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public int getBerat() {
        return berat;
    }
}
