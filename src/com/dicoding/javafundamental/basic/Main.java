package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.dto.KucingAnggora;
import com.dicoding.javafundamental.basic.part6.PrivateModifier;
import com.dicoding.javafundamental.basic.part6.PropertieHewan;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World");
//
//        Gitar.bunyi();
//
//        Mobil.jumlahBan();
//        Motor.jumlahBan();
//        Kereta.jumlahBan();
//
//        Date newDate = new Date();
//
//        System.out.println("Hari ini : " + newDate);
//
//        Date tomorrow = DateUtils.addDays(newDate, 1);
//
//        System.out.println("Besok :" + tomorrow);

        // Membuat object baru dari class
//        KucingAnggora objectKucing = new KucingAnggora("Tom");
//
//        objectKucing.cetakNama("Irpan");
//
//        PropertieHewan propertieHewan = new PropertieHewan(3);
//
//        propertieHewan.jalan();
//        propertieHewan.lari();
//        propertieHewan.makan();

        PrivateModifier privateModifier = new PrivateModifier();

//        System.out.println("Age private : " + privateModifier.age); // Error karena mau access private modifier
//        System.out.println("Age private : " + privateModifier.getAgePrivate()); // Error karena mau access private modifier
        System.out.println("Age private : " + privateModifier.getAge());
//        System.out.println(privateModifier.name); // Error karena modifiernya default and beda package
//        System.out.println(privateModifier    .address); // Error karena modifiernya default and beda package

    }
}
