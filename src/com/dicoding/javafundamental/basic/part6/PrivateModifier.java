package com.dicoding.javafundamental.basic.part6;

public class PrivateModifier {

    private int age = 5;

    // Default Modifier
    String name = "default";
    String address = "address";

    // Bisa di akses selama ada turunan yang memakainya
    protected String fullName = "fullname";

    private int getAgePrivate(){
        return age;
    }

    public int getAge() {
        int hasil = getAgePrivate() + this.age;

        return hasil;
    }


    public static void main(String[] args) {

    }
}
