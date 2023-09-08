package com.dicoding.javafundamental.basic.part9;

import com.dicoding.javafundamental.basic.dto.Users;

import java.util.ArrayList;
import java.util.List;

public class TypeParameter {

    public static void main(String[] args) {
        List arrayList = new ArrayList<>(); // Tanpa pakai type-paramater yang dimana tidak di kasih tau dan bebas akan menerima apa aja

        arrayList.add("test1"); // Bisa di isi dengan string
        arrayList.add(new Users("testing 2", 19)); // bisa di isi dengan object

        List<Users> usersList = new ArrayList<>();

        usersList.add(new Users("testing 2", 19));
//        usersList.add("testing 3"); // Error karena memakai penjagaan type-paramater yang hanya boleh di isi dengan apa yang di deklarasi

    }
}
