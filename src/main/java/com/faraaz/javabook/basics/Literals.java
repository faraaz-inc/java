package com.faraaz.javabook.basics;

public class Literals {
    public void demo() {
        int x = 0b101;
        long y = 0xfffL;
        long z = 3_24_32L;

        System.out.println("Binary literal:" + x);
        System.out.println("Long hex literal:" + y);
        System.out.println("Decimal long literal:" + z);
    }
}
