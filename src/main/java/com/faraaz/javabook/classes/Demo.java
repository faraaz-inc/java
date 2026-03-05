package com.faraaz.javabook.classes;

class Box {
    double length;
    double width;
    double depth;

    double volume() {
        return length*width*depth;
    }
}

public class Demo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        //assign values to instance variables of box
        mybox.depth = 5;
        mybox.length = 10;
        mybox.width = 10;
        vol = mybox.volume();

        System.out.println("Volume of box is: " + vol);
    }
}