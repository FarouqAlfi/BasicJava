package com.dicoding.javafundamental.basic.part12;

import java.util.Calendar;

public class CalenderBasic {

    // Class calender biasa di gunakan untuk memanipulasi data date and mengkonversi data tanggal dan waktu secara instant
    public static void main(String[] args) {

        // Menampilkan waktu sekarang dan inisiasi calender
        Calendar calendar = Calendar.getInstance();

        System.out.println("Waktu sekarang : " + calendar.getTime());

        // Menampilkan secara terpisah
        System.out.println("Tanggal sekarang : " + calendar.get(Calendar.DATE));
        System.out.println("Tahun sekarang : " + calendar.get(Calendar.YEAR));
        System.out.println("Bulan sekarang : " + calendar.get(Calendar.MONTH));

        // Menampilkan waktu 15 hari yang lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("Waktu sekarang : " + calendar.getTime());

        // Menampilkan waktu 4 bulan yang akan datang
        calendar.add(Calendar.MONTH, 4);
        System.out.println("Waktu sekarang : " + calendar.getTime());

        // Menampilkan waktu 2 tahun yang akan datang
        calendar.add(Calendar.YEAR, 2);
        System.out.println("Waktu sekarang : " + calendar.getTime());
    }
}
