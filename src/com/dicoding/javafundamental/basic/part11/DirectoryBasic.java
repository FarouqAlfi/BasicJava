package com.dicoding.javafundamental.basic.part11;

import java.io.File;

public class DirectoryBasic {

    public static void main(String[] args) {
//        String path = "/java/latihan";
//        File file = new File(path);
//
//        // Create directory and parent directory
//        file.mkdirs();

        getListFile();
    }

    private static void getListFile() {
        String path = "/java/latihan";
        File file = null;
        String[] list;

        try {
            file = new File(path);

            list = file.list();

            for (String data : list) {
                System.out.println("Filenya : " + data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
