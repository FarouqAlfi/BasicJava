package com.dicoding.javafundamental.basic.part8;

public class Kucing extends Hewan implements Mamalia{

    String ras;

    String habitat;

    public Kucing(String ras, String habitat) {
        super();

        this.ras = ras;
        this.habitat = habitat;

        System.out.println("Construct Kucing");
    }

    @Override
    public void makan() { // Override
        System.out.println("Kucing sedang makan...");
    }

    public void makan(String makanan) { // Overloading
        System.out.println("Kucing sedang makan " + makanan);
    }

    @Override
    public String toString() {
        return "Kucing ras : " + this.ras + ", habitat : " + this.habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Kucing) {
            Kucing kucing = (Kucing) obj;

            return this.ras.equals(kucing.ras);
        } else {
            return false;
        }
    }
}
