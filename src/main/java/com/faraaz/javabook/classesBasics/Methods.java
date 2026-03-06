package com.faraaz.javabook.classesBasics;

class Box2 {
    double length;
    double width;
    double height;

    //default constructor
    Box2() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }
    //overloaded constructor
    Box2(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    double volume(){
        return this.length * this.width * this.height;
    }
}

public class Methods {
    public static void main(String[] args) {
        Box2 mybox = new Box2(5, 10, 10);

        System.out.println("Volume of box is: " + mybox.volume());
    }
}
