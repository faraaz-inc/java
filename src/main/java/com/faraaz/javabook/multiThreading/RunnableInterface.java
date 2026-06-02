package com.faraaz.javabook.multiThreading;

class NewThread implements Runnable {
    Thread t;

    //create a new second thread in the constructor
    NewThread() {
        //create new thread
        this.t = new Thread(this, "Demo thread");

        System.out.println("Child thread: " + t);
    }
    //entry point of this thread
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
        finally {
            System.out.println("Exiting child thread");
        }
    }
}

public class RunnableInterface {

    public static void main(String[] args) {
        NewThread nt = new NewThread();

        nt.t.start(); //start the child thread

        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        finally {
            System.out.println("Exiting main thread");
        }
    }
}
