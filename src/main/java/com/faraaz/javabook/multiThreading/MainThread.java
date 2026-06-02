package com.faraaz.javabook.multiThreading;

public class MainThread {

    public static void main(String[] args) {
        //obtain reference to current thread
        Thread t = Thread.currentThread();

        System.out.println("Current thread: ");
        System.out.println("Thread number, Name of thread, priority, Name of its group");
        System.out.println(t);

        //change the name of the thread
        t.setName("MyThread");
        System.out.println("After name change: " + t.getName());

        try {
            for(int i = 0; i < 5; i++) {
                System.out.println(5 - i);
                t.sleep(1000);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Caught interrupted exception");
            System.out.println(e);
        }

    }
}
