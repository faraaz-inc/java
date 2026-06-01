package com.faraaz.javabook.interfaces;

public class InterfaceReference {
    public static void main(String[] args) {
        //type of c is Callback, yet its assigned an instance of ApplyCallback
        Callback c = new ApplyCallback();

        Client ob = new Client();

        //c can access only the methods specified in Callback interface
        c.callback();

        //c reference variable can be used to refer to any class that implements that interface
        //the exact method to call will be inferred dynamically at run-time
        c = ob;

        c.callback();
    }
}
