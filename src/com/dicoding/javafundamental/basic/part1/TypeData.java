package com.dicoding.javafundamental.basic.part1;

public class TypeData {

    public static void main(String[] args) {
        // Byte
        byte value = 10;
        byte anotherValue = -10;

        // String (type data reference dari module string)
        String greeting = "Hello World !";

        System.out.println("String :" + greeting);

        char[] dicoding = {'d', 'i', 'c', 'o', 'd', 'i', 'n', 'g'};

        String dicodingString = new String(dicoding);

        System.out.println(dicodingString);
        System.out.println("Length : " + dicodingString.length());
        System.out.println("Char at : " + dicodingString.charAt(0));
            // String format ada type format untuk masing2 type value
        System.out.println("Format : " + String.format("%s", dicodingString));
        System.out.println("Format 2 : " + String.format("%d", 0));
        System.out.println("Substring : " + dicodingString.substring(1));
        System.out.println("Contains : " + dicodingString.contains("di"));
        System.out.println("Equals : " + dicodingString.equals("Dicoding"));
    }
}
