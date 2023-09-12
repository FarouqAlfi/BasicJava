package com.dicoding.javafundamental.basic.part11;

import java.io.*;

public class StreamByte {

    public static void main(String[] args) {
        FileInputStream  in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("D:input.txt");
            out = new FileOutputStream("D:output.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }

            // Kalau IOException di pakai di pertama ini maka file not found tidak akan tertrigger karena sudah terhandle di IOException
        } catch (FileNotFoundException f) {
            System.out.println("Error FileNotFoundExcelption :" + f.getMessage());

            // IOException adalah general / common base semua error
        } catch (IOException e) {
            System.out.println("Error IOException :" + e.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }

                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Error finaly IOException :" + e.getMessage());
            }
        }
    }
}
