package com.dicoding.javafundamental.basic.part10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionBasic {

    public static void main(String[] args) {
        // Block try : akan menjalankan semua code di dalam try
        try {
            // Membaca file berdasarkan path
            File file = new File("D://test.txt");
            FileReader fileReader = new FileReader(file);

            System.out.println("File Reader Berhasil");
        // Block catch : incase block try codenya error maka akan menjalankan Block catch
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        // Multi block catch : sejak java 7 bisa nambah multi catch berdasarkan kebutuhan codenya
//        catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        // Block finally : akan di jalankan codenya walaupun block code nya berhasil atau masuk ke block catch
        // Biasa di gunakan untuk cleanup code seperti menutup konexi jaringan database, stream , berkas dan lain2
        finally {

        }
    }
}
