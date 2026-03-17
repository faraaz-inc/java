package com.faraaz.javabook.packages.p1;

class Derived extends Protection {
    Derived() {
        System.out.println("Derived Constructor");
        System.out.println("n: " + n);

        //n_priv is only accessible in the same class
//        System.out.println("n_priv: " + n_priv);
        System.out.println("n_pro: " + n_pro);
        System.out.println("n_pub: " + n_pub);
    }
}
