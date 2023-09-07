package com.dicoding.javafundamental.basic.part8;

import java.util.Objects;

public class MainPart8 {

    public static void main(String[] args) {
        Hewan hewan = new Hewan();

        System.out.println("Apakah hewan IS-A object -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A kucing -> " + (hewan instanceof Kucing));


        System.out.println("----------------------------------------------------");

        Kucing kucing = new Kucing();

        System.out.println("Apakah hewan IS-A object -> " + (kucing instanceof Object));
        System.out.println("Apakah hewan IS-A hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah hewan IS-A kucing -> " + (kucing instanceof Kucing));

    }
}
