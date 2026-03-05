package com.faraaz.javabook.basics;

public class Var {
    public void demo(){
        double a = 3.14;
        var b = 3.14; //both gets assigned to double

        var arr = new int[10]; //valid
        // var[] arr = new int[10] --> wrong
    }
}
