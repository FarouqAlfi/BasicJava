package com.dicoding.javafundamental.basic.dto;

public class Users {

    String name;

    int age;

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", Age : " + age;
    }
}
