package com.dicoding.javafundamental.basic.part5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListBasic {

    public static void main(String[] args) {
        // Deklarasi Array
        int[] intArray = new int[2];
        intArray[0] = 1;
        intArray[1] = 2;
        // intArray[2] = 3; // Erroy ArrayIndexOutOfBoundsException karena ukuran array tetep sama , gk bisa di tambah


        List<Integer> integerList = new ArrayList<>();

        integerList.add(1); // Method add menambahkan object ke list
        integerList.add(2);
        integerList.add(3);

        System.out.println("List value integerList :");

        for (int i = 0; i < integerList.size(); i++) { // Method size untuk mendapatkan ukuran array
            System.out.println("\t index-" + i + " = " + integerList.get(i)); // Method get untuk mendapatkan value dari array index i
        }

        integerList.remove(2); // Method remove untuk menghilangkan object di dalam array list

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println("\t index-" + i + " = " + integerList.get(i));
        }


    }
}
