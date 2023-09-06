package com.dicoding.javafundamental.basic.part5;

import com.dicoding.javafundamental.basic.dto.Users;

import java.util.HashMap;
import java.util.Map;

public class MapBasic {

    public static void main(String[] args) {
        Map<String, Users> usersMap = new HashMap<>();

        usersMap.put("key-1", new Users("budi", 19)); // Method put untuk menambahkan object ke map
        usersMap.put("key-2", new Users("ahmad", 20));
        usersMap.put("key-3", new Users("mega", 21));
        usersMap.put("key-4", new Users("irvan", 22));
        usersMap.put("key-4", new Users("maulana", 23)); // Memasukan key yang sama ke map

        System.out.println("Map Size : " + usersMap.size()); // Method size untuk melihat jumlat object didalam map

        for (String data : usersMap.keySet()) { // Method keySet untuk looping key nya dari map
            System.out.println("Key : " + data + ", value : " + usersMap.get(data)); // Method get untuk mendapatkan object dari key map
        }

        for (Users data : usersMap.values()) {
            System.out.println("\t " + data);
        }
    }
}
