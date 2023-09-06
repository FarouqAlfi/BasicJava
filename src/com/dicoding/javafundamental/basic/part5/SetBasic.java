package com.dicoding.javafundamental.basic.part5;

import java.util.HashSet;
import java.util.Set;

public class SetBasic {

    public static void main(String[] args) {
        // Menggunakan Hashset
        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(1); // Method add digunakan untuk menambahkan object ke set
        integerSet.add(1);
        integerSet.add(2); // Object yang di tambahkan tidak bisa diduplikasikan di set
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);

        System.out.println("Set integer awal: (size = " + integerSet.size() + ")");
        for (Integer planet : integerSet) {
            System.out.println("\t " + planet);
        }
    }
}
