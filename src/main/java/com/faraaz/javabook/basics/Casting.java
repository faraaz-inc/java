package com.faraaz.javabook.basics;

public class Casting {
    public void demo() {
        int a = 100_000;
        byte b;
        b = (byte) a; //explicit type casting
        //If a's size is larger than the range of byte,
        //then the value will be reduced to modulo of byte's range

        float c = 3.14f;
        int d;
        d = (int) c; //c's value will be truncated

        byte e = 40;
        byte f = 50;
        int g = (e * f) / b; // the intermediate expression is calculated using int
        //also promotes the result to int
        // byte g = (e * f) / b;  --> error, the result is also promoted to int, hence can't be stored in a byte

        //correct method
        byte h = (byte)((e * f) / b);
    }
}
