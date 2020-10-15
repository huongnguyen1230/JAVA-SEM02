package JAVA_11.test;

import JAVA_11.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("the circle has radius " + c1.getRadius() +
                " and area of " + c1.getArea());
        //
        Circle c2 = new Circle(2.0);
        System.out.println("the circle has radius of " + c2.getRadius()
        + " and area of "+ c2.getArea());
        //test method getColor
        Circle c3 = new Circle(2.0, "blue");
        System.out.println("the circle has radius of " + c3.getRadius()
                + " and area of "+ c3.getArea() + "and color of " + c3.getColor());
        Circle c4 = new Circle("purple");
        System.out.println("the circle has color " + c4.getColor());

    }
}
