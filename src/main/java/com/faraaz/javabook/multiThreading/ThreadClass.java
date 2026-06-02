package com.faraaz.javabook.multiThreading;

class NewThread2 extends Thread {

    NewThread2() {
        //create a new second thread
        super("Demo Thread");
        System.out.println("Child thread: " + this);
    }

    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Child thread interrupted: " + e);
        }
        System.out.println("Exiting child thread");
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        NewThread2 nt = new NewThread2();

        nt.start();

        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Main Thread interrupted: " + e);
        }
        System.out.println("Exiting main thread");
    }
}
