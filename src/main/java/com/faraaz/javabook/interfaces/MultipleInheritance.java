package com.faraaz.javabook.interfaces;

interface Alpha {
    default void show() {
        System.out.println("Show from Alpha");
    }

    default void display() {
        System.out.println("Display from Alpha");
    }
}

interface Beta {
    default void show() {
        System.out.println("Show from Beta");
    }

    default void display() {
        System.out.println("Display from Beta");
    }
}

interface Gamma extends Alpha {
    @Override
    default void show() {
        System.out.println("Show overriden in Gamma from Alpha");
    }
}

class Delta implements Alpha, Beta {
    //overriden method always takes precedence
    @Override
    public void show() {
        System.out.println("Overriden Show from Gamma");
    }
    //display is not overriden, hence it will throw an error because of ambiguity

    @Override
    public void display() {
        //Alpha specifies the parent interface to use
        //super points to parent interface
        //display() calls the method
        Alpha.super.display();
    }
}

public class MultipleInheritance {
}
