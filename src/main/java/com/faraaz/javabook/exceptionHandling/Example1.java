package com.faraaz.javabook.exceptionHandling;

public class Example1 {
    public static void main(String[] args) {
        int d, a;

        try  {
            d = 0;
//            a = 42 / d;

            int l = args.length;
            String s = args[l];
            System.out.println("This will not be printed");
        }
        //in case of multiple catch blocks, exception subclasses must come before its superclass
        catch(ArithmeticException e) {
            //catch divide by zero
            System.out.println("Caught Division by zero");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Array index out of bounds error");
            System.out.println(e);
        }
        //superclass exception at the last
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block");
        }
        System.out.println("End of program");
    }
}
