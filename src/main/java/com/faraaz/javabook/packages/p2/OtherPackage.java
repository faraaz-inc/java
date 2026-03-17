package com.faraaz.javabook.packages.p2;

import com.faraaz.javabook.packages.p1.Protection;
import java.util.Date;
import java.lang.*;   //import all classes in java.lang package

public class OtherPackage {
    OtherPackage() {
        //we'll do imports
        Protection p = new Protection();

        System.out.println("Other package constructor:");

        //class only
        //System.out.println("n: " + p.n);

//        class or package only
//        System.out.println("n_priv: " + p.n_priv);

//        class, subclass or package only
//        System.out.println("n_pro: " + p.n_pro);

//      accessible anywhere
        System.out.println("n_pub: " + p.n_pub);


    }
}
