package com.faraaz.javabook.basics;

public class Arrays {
    public void demo() {
        int[] days  = new int[10];
        int months[] = {1,2,3,4,5,6,7,8,9,10,11,12}; //legal

        int[][] twoD = new int[12][12];


        int[][] anotherTwoD = new int[3][];
        for (int j = 0; j < 3; j++) {
            anotherTwoD[j] = new int[5];
        }


        for(int i = 0; i < 10; i++) {
            days[i] = i;
        }
        for(int i = 0; i < 10; i++)
            System.out.println("Day: " + days[i]);

        System.out.println("Size of the days array: " + days.length);

        return;
    }
}
