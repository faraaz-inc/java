package com.faraaz.javabook.exceptionHandling;

class ThrowDemo {
    public void demo() {
        try {
            //new instance of null pointer exception is created
            //most built-in runtime exceptions have two constructors
            // one having no argument, one having string argument
            throw new NullPointerException("Demo");
        }
        catch(NullPointerException e) {
            //catch the exception
            System.out.println("Caught in the ThrowDemo class: " + e);
            //re throw to upper try block
            throw e;
        }
    }
    //if a method is capable of throwing an error that it does not handle,
    // it must be declared in throws:
    //otherwise compile time error will result
    public void throwsDemo() throws IllegalAccessException {

        throw new IllegalAccessException("Demo of illegal access exception");
    }
}

public class Throw {
    public static void main(String[] args) {
        ThrowDemo t = new ThrowDemo();
        try {
            t.demo();
        }
        catch(NullPointerException e) {

            System.out.println("Recaught: " + e);
        }

        //while calling a method that has throws clause,
        //its necesssary to contain it in a try/catch block
        try {
            t.throwsDemo();
        }
        catch(IllegalAccessException e) {
            System.out.println("Illegal access exception: " + e);
        }
    }
}
