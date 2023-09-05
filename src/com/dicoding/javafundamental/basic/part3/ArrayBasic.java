package com.dicoding.javafundamental.basic.part3;

public class ArrayBasic {

    public static void main(String[] args) {
        int[] arrInt = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println("Array nya 1 : " + arrInt[0]);
        System.out.println("Array nya 2 : " + arrInt[1]);
        System.out.println("Array nya 3 : " + arrInt[2]);
        System.out.println("Array nya 4 : " + arrInt[3]);
        System.out.println("Array nya 5 : " + arrInt[4]);

        // Multi Dimensional Array

        char[][] arrChar = new char[2][];

        arrChar[0] = new char[2];
        arrChar[1] = new char[3];

        // Dimensional 1 yang indexnya 0 memiliki element 2
        arrChar[0][0] = 'A';
        arrChar[0][1] = 'B';

        // Dimensional 1 yang indexnya 1 memiliki element 3
        arrChar[1][0] = 'C';
        arrChar[1][1] = 'D';
        arrChar[1][2] = 'E';

        // Dimensional 1 Memiliki Index 0
        System.out.println("Dimensional 1 dengan index 0, Dimensional 2 dengan index 0 : " + arrChar[0][0]);
        System.out.println("Dimensional 1 dengan index 0, Dimensional 2 dengan index 1 : " + arrChar[0][1]);


        // Dimensional 1 Memiliki Index 1
        System.out.println("Dimensional 1 dengan index 1, Dimensional 2 dengan index 0 : " + arrChar[1][0]);
        System.out.println("Dimensional 1 dengan index 1, Dimensional 2 dengan index 1 : " + arrChar[1][1]);
        System.out.println("Dimensional 1 dengan index 1, Dimensional 2 dengan index 2 : " + arrChar[1][2]);
    }
}
