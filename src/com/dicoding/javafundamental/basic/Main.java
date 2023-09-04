package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.*;
import com.dicoding.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Gitar.bunyi();

        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date newDate = new Date();

        System.out.println("Hari ini : " + newDate);

        Date tomorrow = DateUtils.addDays(newDate, 1);

        System.out.println("Besok :" + tomorrow);
    }
}
