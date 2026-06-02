package com.faraaz.javabook.multiThreading;

class NewThread3 implements Runnable {
    Thread t;
    String name;

    NewThread3(String name) {
        this.name = name;
        this.t = new Thread(this, name);
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
        finally {
            System.out.println("Exiting child thread");
        }
    }
}

public class JoinExample {

    public static void main(String[] args) {
        NewThread3 nt1 = new NewThread3("Thread1");
        NewThread3 nt2 = new NewThread3("Thread2");
        NewThread3 nt3 = new NewThread3("Thread3");

        //Start the threads
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("Thread 1: " + nt1.t.isAlive());
        System.out.println("Thread 2: " + nt2.t.isAlive());
        System.out.println("Thread 3: " + nt3.t.isAlive());

        try {
            System.out.println("Waiting for threads to finish");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        }
        catch(InterruptedException e) {
            System.out.println("Main Thread interrupted: " + e);
        }

        //check status of all threads now
        System.out.println("Thread 1: " + nt1.t.isAlive());
        System.out.println("Thread 2: " + nt2.t.isAlive());
        System.out.println("Thread 3: " + nt3.t.isAlive());

        System.out.println("Main thread exiting");
    }

}
