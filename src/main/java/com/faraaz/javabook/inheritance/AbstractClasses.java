package com.faraaz.javabook.inheritance;

abstract class Figure2 {
    double dim1;
    double dim2;

    Figure2(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }

    abstract double area();

    final void show() {
        System.out.println("This is a final method and cannot be overriden");
    }

}

// final class, cannot be further inherited
final class Rectangle2 extends Figure2 {

    Rectangle2(double a, double b) {
        super(a, b);
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle2 extends Figure2 {

    Triangle2(double a, double b) {
        super(a, b);
    }

    double area() {
        return (dim1 * dim2) / 2;
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        // Figure2 f = new Figure2(); --> illegal now
        Rectangle2 r = new Rectangle2(10, 10);
        Triangle2 t = new Triangle2(10, 10);
        Figure2 ref; // OK, no object is created

        ref = r;
        System.out.println("Area of Rectangle: " + ref.area());

        ref = t;
        System.out.println("Area of Triangle: " + ref.area());
    }
}
