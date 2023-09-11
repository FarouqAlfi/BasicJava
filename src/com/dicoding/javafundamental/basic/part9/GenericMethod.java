package com.dicoding.javafundamental.basic.part9;

import java.util.Collection;

public class GenericMethod {

//    static void arrayToCollection(Object[] a, Collection<?> c) { // Ganti type parameter unknown menjadi generik method
    static <T> void arrayToCollection(T[] a, Collection<T> c) { // Mengganti menjadi T (type) parameter
        for (T data : a) {
            c.add(data); // Error karena collection menerima unknown type parameter
        }
    }
    public static void main(String[] args) {

    }


}
