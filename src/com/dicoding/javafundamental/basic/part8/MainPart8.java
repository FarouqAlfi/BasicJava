package com.dicoding.javafundamental.basic.part8;

import java.util.Objects;

public class MainPart8 {

    public static void main(String[] args) {
        Hewan hewan = new Hewan();

        System.out.println("Apakah hewan IS-A object -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A kucing -> " + (hewan instanceof Kucing));


        System.out.println("----------------------------------------------------");

        Kucing kucing = new Kucing("testing1", "manaja");

        System.out.println("Apakah hewan IS-A object -> " + (kucing instanceof Object));
        System.out.println("Apakah hewan IS-A hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah hewan IS-A kucing -> " + (kucing instanceof Kucing));

        System.out.println("----------------------------------------------------");

        hewan.makan();
        kucing.makan();
        kucing.makan("ikan");

        System.out.println("----------------------------------------------------");

        Kucing meow = new Kucing("ras1", "tempat dingin");
        Kucing puss = new Kucing("ras1", "tempat dingin");
        Kucing popo = new Kucing("ras2", "tempat panas");

        System.out.println(meow.toString());
        System.out.println(popo.toString());
        System.out.println(puss.toString());

        System.out.println("----------------------------------------------------");

        System.out.println("meow equals to puss ? : " + meow.equals(puss));
        System.out.println("meow equals to popo ? : " + meow.equals(popo));

        System.out.println("----------------------------------------------------");

        Object o = new Kucing("testing1", "manaja");
        Hewan h = new Kucing("testing1", "manaja");
        Kucing k = new Kucing("testing1", "manaja");

//        o.makan(); // Error karena tidak ada method makan di object
        h.makan();
        k.makan();

        Object oH = h; // Bisa langsung di assign karena hewan itu object
        Hewan hewan1 = k; // Bisa langsung di assign kucing sudah pasti hewan tapi tidak sebaliknya

//        oH.makan() // Error karena tidak ada method makan di object
        hewan1.makan();

        Kucing kucing1 = (Kucing) h; // Tidak bisa langsung di assign , harus di casting

        kucing1.makan();

        Hewan harimau = new Hewan();

        Kucing kucing2 = (Kucing) harimau; // Compile ok tapi bakal error ClassCastException karena hewan belum tentu kucing
        // Line 64 bisa karena sebelumnya variable h dari casting kucing

        Mamalia mamalia = new Kucing("test1", "test1");


    }
}
