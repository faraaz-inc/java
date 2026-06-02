package com.faraaz.javabook.multiThreading;

class Callme {
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    Thread t;
    String name;
    Callme target;
    String msg;

    Caller(Callme target, String name, String msg) {
        this.t = new Thread(this, name);
        this.name = name;
        this.msg = msg;
        this.target = target;
    }
    @Override
    public void run() {
        target.call(msg);
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Callme target = new Callme();

        Caller ob1 = new Caller(target, "Thread 1", "Hello");
        Caller ob2 = new Caller(target, "Thread 2", "Synchronized");
        Caller ob3 = new Caller(target, "Thread 3", "World");


        //wait for them to finish
        try {
            //start the threads
            ob1.t.start();
            Thread.sleep(100);
            ob2.t.start();
            Thread.sleep(100);
            ob3.t.start();

            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch(InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }
    }
}
