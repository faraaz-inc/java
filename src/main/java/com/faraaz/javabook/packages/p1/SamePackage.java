package com.faraaz.javabook.packages.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Same Package constructor:");
        System.out.println("n: " + p.n);

        //class only
//        System.out.println("n_priv: " + p.n_priv);
        System.out.println("n_pro: " + p.n_pro);
        System.out.println("n_pub: " + p.n_pub);
    }
}
