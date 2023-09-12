package com.dicoding.javafundamental.basic.part12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatBasic {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf.format(new Date());

        System.out.println("Format dengan default : " + new Date());
        System.out.println("Format dengan format : " + date);
    }
}
