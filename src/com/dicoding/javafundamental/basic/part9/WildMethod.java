package com.dicoding.javafundamental.basic.part9;

import com.dicoding.javafundamental.basic.dto.Users;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WildMethod {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("test 1");
        stringList.add("test 2");

        print(stringList); // Error karena type bukan object

        Collection<Users> usersList = new ArrayList<>();

        usersList.add(new Users("irvan", 19));
        usersList.add(new Users("maulana", 20));

        print(usersList); // Error karena type bukan object
    }

    // public static void print(Collection<Object> collection) { // Ganti dari type parameternya object jadi wildcard type
    public static void print(Collection<?> collection) { // Menjadi type parameter unknown
        for (Object data : collection) {
            System.out.println(data);
        }
    }
}
