package com.faraaz.javabook.basics;

public class Labels {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Before break");
                    if(t)
                        break second; //break out of second block
                }
                System.out.println("Outside third, inside second");
            }
            System.out.println("Outside second, inside first");
        }
        System.out.println("Outside first");

        outer: for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.println("i = " + i + ", j = " + j);
                continue outer;
            }
        }
    }
}
