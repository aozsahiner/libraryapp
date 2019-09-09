package com.example.mylibrary;

public class DortIslem {
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int cikar(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    public static int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public static float bol(int sayi1, int sayi2) {
        if (sayi2 == 0) {
            throw new IllegalArgumentException("Sifira bolme hatasi");
        } else {
            return sayi1 / sayi2;
        }
    }
}
