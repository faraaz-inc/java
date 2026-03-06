package com.faraaz.javabook.inheritance;

class Myclass {
    void display() {
        System.out.println("First class");
    }
}

class FirstDerivedClass extends Myclass {
    int x;
}

class SecondDerivedClass extends FirstDerivedClass {
    int y;
}

public class TypeInference {
    //return some type of MyClass object
    static Myclass getObj(int which) {
        switch (which) {
            case 0:
                return new Myclass();
            case 1:
                return new FirstDerivedClass();
            default:
                return new SecondDerivedClass();
        }
    }

    public static void main(String[] args) {
//        Even though getObj() returns many different types of objects
//        the class inferred by var will be MyClass because
//        that is the return type of getObj(), irrespective of the fact that
//        different types of objects are being obtained

        //Here getObj returns a MyClass object
        var ref = getObj(0);

        //In this case, FirstDerivedClass object is obtained
        var ref2 = getObj(1);

        //Here, SecondDerivedClass object is returned
        var ref3 = getObj(2);

        //As both ref2 and ref3 are inferred as MyClass, neither of them can access new members
        // defined by First and Second derived classes

        // ref2.x; --> ERROR

    }
}
