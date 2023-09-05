package com.dicoding.javafundamental.basic.part4;

public class Switch {

    public static void main(String[] args) {
        int value = 7;

        // Switch tanpa break akan menjalankan code case di bawahnya.
        switch (value) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 6:
                System.out.println(6);
                break;
            default:
                System.out.println("Switch case tidak ada yang terpenuhi");
                break;
        }
    }
}
