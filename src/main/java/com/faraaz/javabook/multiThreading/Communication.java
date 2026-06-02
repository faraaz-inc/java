package com.faraaz.javabook.multiThreading;

class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while(!valueSet) {
            try {
                wait();
            }
            catch(InterruptedException e) {
                System.out.println("Interrupted exception caught");
            }
        }
        System.out.println("Got: " + n);
        valueSet = false;
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            System.out.println("Interrupted exception caught");
        }
        notify();
        return n;
    }

    synchronized void put(int n) {
        while(valueSet) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println("Interrupted exception caught");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            System.out.println("Interrupted exception caught");
        }
        notify();
    }
}

class Producer implements Runnable {
    Q q;
    Thread t;

    Producer(Q q) {
        this.q = q;
        this.t = new Thread(this, "Producer");
    }

    @Override
    public void run() {
        int i = 0;

        while(true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;
    Thread t;

    Consumer(Q q) {
        this.q = q;
        this.t = new Thread(this, "Consumer");
    }

    @Override
    public void run() {
        int i = 0;

        while(true) {
            q.get();
        }
    }
}

public class Communication {

    public static void main(String[] args) {
        Q q = new Q();

        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        //start the threads
        p.t.start();
        c.t.start();


        System.out.println("Press Ctrl + C to stop");
    }
}
