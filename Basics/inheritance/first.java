package Basics.inheritance;

// Single Inheritance
class Shape {
    String color;
    public void area() {
        System.out.println("display area");
    }
}

// Hierarchical Inheritance
class Triangle extends Shape {
    public void area(float l, float h) {
        System.out.println("area of triangle " + 0.5 * l * h);
    }
}

class Circle extends Shape {
    public void area(float r) {
        System.out.println("area of circle " + 3.14 * r * r);
    }
}

// Multiple Inheritance using Interfaces
interface Drawable {
    void draw();
}

class Rectangle extends Shape implements Drawable {
    public void area(float l, float b) {
        System.out.println("area of rectangle " + l * b);
    }

    public void draw() {
        System.out.println("drawing rectangle");
    }
}

// Hybrid Inheritance
class Square extends Rectangle {
    public void area(float side) {
        System.out.println("area of square " + side * side);
    }
}

public class first {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
        System.out.println(t1.color);

        Rectangle r1 = new Rectangle();
        r1.draw();

        Square s1 = new Square();
        s1.area(5);
    }
}
