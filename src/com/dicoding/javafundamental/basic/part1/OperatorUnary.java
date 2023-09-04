package com.dicoding.javafundamental.basic.part1;

public class OperatorUnary {
    public static void main(String[] args) {

        System.out.println("Operator Unary Plus");
        int nilaiAwal = 5;
        int nilaiHasil = +nilaiAwal;

        System.out.println("Hasil +5 : " + nilaiHasil);
        System.out.println();

        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 5;
        int nilaiHasil2 = -nilaiAwal2;

        System.out.println("Hasil -5 : " + nilaiHasil2);
        System.out.println();

        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;

        System.out.println("Hasil 5++ : " + nilaiAwal3);
        System.out.println();

        System.out.println("Operator pengurangan nilai sebesar 1 point");
        int nilaiAwal4= 5;
        nilaiAwal4--;

        System.out.println("Hasil 5-- : " + nilaiAwal4);
        System.out.println();
    }
}
