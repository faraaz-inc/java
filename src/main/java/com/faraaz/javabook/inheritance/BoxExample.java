package com.faraaz.javabook.inheritance;

class Box {
    private final double length;
    private final double width;
    private final double height;
    int k = 5;

    Box() {
        //delegates the construction to below constructor by passing 0,0,0
        this(0, 0, 0);
    }
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    //For cube
    Box(double len) {
        this.length = len;
        this.width = len;
        this.height = len;
    }
    Box(Box ob) {
        //copy constructor
        this.width = ob.width;
        this.length = ob.length;
        this.height = ob.height;
    }
    //compute and return volume
    double getVolume() {
        return length * width * height;
    }
}

class BoxWeight extends Box {
    double weight = 0;
    int k = 10;  //this hides the superclass' k

    BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height); // calls Box(double, double, double)
        this.weight = weight;
    }

    BoxWeight(BoxWeight ob) {
        super(ob);  //BoxWeight object is passed to superclass
        this.weight = ob.weight;
    }

    void displayk() {
        System.out.println("Superclass' k: " + super.k); //prints superclass' k
        System.out.println("Subclass' k: " + k);        //prints own k
    }
}

public class BoxExample {
    public static void main(String[] args) {
        BoxWeight mybox = new BoxWeight(5, 10, 10, 100);
        double vol = mybox.getVolume();
        System.out.println("Volume: " + vol);

        //superclass variable can reference to subclass object
        //however only superclass members can be accessed
        Box b; //can't access weight variable
        b = new BoxWeight(0, 0, 0, 0);
        //it is the type of the reference variable that decides what members can be accessed

        mybox.displayk();
    }



}
