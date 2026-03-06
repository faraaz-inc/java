package com.faraaz.javabook.classesBasics;

class VariableArgs {
    static void legacyMethod(int[] v) {
        System.out.println("No. of arguments: " + v.length);
        System.out.print("Contents: ");

        for(int x : v) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
    }
    //a method can hv normal params along with variable length params,
    //variable length param must be the last in that case
    static void varargsMethod(int ... v) {
        // v is implicitly declared as an array type of int[]
        System.out.println("Number of args: " + v.length);
        System.out.print("Contents: ");
        for(int x : v) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
    }
    //overloaded variable argument method
    static void varargsMethod(boolean ... v) {
        // v is implicitly declared as an array type of int[]
        System.out.println("Number of args: " + v.length);
        System.out.print("Contents: ");
        for(boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
    }

    //overloading by adding one or more normal param
    //first argument is passed to a, rest are assumed to belong to v[]
    static void varargsMethod(boolean a, int ... v) {
        // v is implicitly declared as an array type of int[]
        System.out.println("Number of args: " + v.length);
        System.out.print("Contents: ");
        for(int x : v) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
    }
}

public class VarArgs {
    public static void main(String[] args) {
        int[] n1 = {1};
        int[] n2 = {1, 2};
        int[] n3 = {1, 2, 3};

        //Legacy method
        System.out.println("Legacy method: Using array to pass multiple arguments");
        VariableArgs.legacyMethod(n1);
        VariableArgs.legacyMethod(n2);
        VariableArgs.legacyMethod(n3);
        System.out.println("\n\n\n");

        //VarArgs method
        System.out.println("Varargs method:");
        VariableArgs.varargsMethod(1);
        VariableArgs.varargsMethod(1, 2);
        VariableArgs.varargsMethod(1, 2, 3);

        //ambiguous calls, matches to multiple overloaded methods
        // VariableArgs.varargsMethod();
    }
}
