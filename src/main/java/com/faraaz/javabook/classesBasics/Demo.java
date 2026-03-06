package com.faraaz.javabook.classesBasics;

class Box {
    double length;
    double width;
    double depth;

    //constructor
    Box(double length, double width, double depth) {
        System.out.println("Constructing Box");
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    double volume() {
        return length*width*depth;
    }
}

public class Demo {
    public static void main(String[] args) {
        Box mybox = new Box(5, 10, 10);
        double vol = mybox.volume();

        System.out.println("Volume of box is: " + vol);
    }
}