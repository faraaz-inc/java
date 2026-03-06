package com.faraaz.javabook.inheritance;

public class ObjectClass {
    public static void main(String[] args) {
        //Object is the superclass of all classes in java
        Box b = new Box();

        //Universal methods available in all classes
        String description = b.toString(); //automatically called when an object is output in println
        System.out.println(description);
        System.out.println(b.toString());
    }
}
