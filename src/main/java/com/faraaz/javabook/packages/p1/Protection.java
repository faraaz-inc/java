package com.faraaz.javabook.packages.p1;

public class Protection {
    int n = 1; //Default access, visible to classes in same package
    private int n_priv = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.println("Base constructor Protection()");
        System.out.println("n: " + n);
        System.out.println("n_priv: " + n_priv);
        System.out.println("n_pro: " + n_pro);
        System.out.println("n_pub: " + n_pub);

    }
}
