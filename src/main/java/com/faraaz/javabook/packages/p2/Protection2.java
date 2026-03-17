package com.faraaz.javabook.packages.p2;

public class Protection2 extends com.faraaz.javabook.packages.p1.Protection {
    //this class has access to all variables except private and default
    Protection2() {
        System.out.println("Derived p2 constructor:");

        //class or package only
        //System.out.println("n: " + n);

        //class only
        //System.out.println("n_priv: " + n_priv);

        System.out.println("n_pro: " + n_pro);
        System.out.println("n_pub: " + n_pub);
    }
}
