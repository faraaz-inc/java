package com.faraaz.javabook.interfaces;

interface interfaceOne {
    void showMe();
}

//interface two inherits interfaceOne
interface interfaceTwo extends interfaceOne {
    void showThem();
}

public class InterfaceChain implements interfaceTwo {
    //must implement all the methods
    public void showMe() {
        System.out.println("Show Me");
    }
    public void showThem() {
        System.out.println("Show Them");
    }
}
