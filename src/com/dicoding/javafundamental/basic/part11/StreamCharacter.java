package com.dicoding.javafundamental.basic.part11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamCharacter {

    // Bedanya file reader sama file input stream adalah di bagian bisa membaca 2 byte dalam satu waktu
    // Kalau mau menggunakan file reader saat data yang kita miliki memiliki character "Unicode conventions"
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("D:input.txt");
            out = new FileWriter("D:output.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException f) {
            f.printStackTrace();
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
