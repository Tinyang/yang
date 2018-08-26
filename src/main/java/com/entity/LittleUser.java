package com.entity;

public class LittleUser extends User {

    public static void main(String[] args) {
        LittleUser littleUser = new LittleUser();
        System.out.println(littleUser.name);
        System.out.println(littleUser.getUsername());
    }
}
