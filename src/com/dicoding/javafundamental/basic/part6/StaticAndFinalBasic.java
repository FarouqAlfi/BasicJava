package com.dicoding.javafundamental.basic.part6;


// Final bisa di tambahkan class tapi class tersebut tidak bisa di jadikan induk kelas
public class StaticAndFinalBasic {
    // Bisa di akses tanpa perlu instance classnya and hanya berjumlah 1 saja variablenya kalau static
    public static int nilai = 0;

    public final int nilai2 = 5;

    // Biasanya final digunakan bersamaan dengan static untuk membuat suatu konstanta yang hanya 1 varible saja.

    // Sama kayak varibale static
    public static int getNilai() {
        return nilai;
    }


    public void tambahNilai2() {
        // Kena error karena final valuenya tidak bisa di ubah2
//        nilai2 = 10;
    }

    // Method yang memakai final tidak bisa di override oleh anak kelas
    public final int getNilai2() {
        return nilai2;
    }
}
