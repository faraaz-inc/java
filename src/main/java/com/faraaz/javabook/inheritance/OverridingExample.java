package com.faraaz.javabook.inheritance;

class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }

    double area() {
        System.out.println("Area for figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    //overriding area for rectange
    double area() {
        System.out.println("Inside area for rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area of triangle");
        return (dim1 * dim2) / 2;
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(10, 10);
        Triangle t = new Triangle(10, 10);

        double af = f.area();
        System.out.println("Area of figure: " + af);
        double ar = r.area();
        System.out.println("Area of rectangle: " + ar);
        double at = t.area();
        System.out.println("Area of triangle: " + at);

    }
}
