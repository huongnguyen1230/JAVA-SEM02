package ex2;

public class  TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 4, 5);
        System.out.println(s1);
        //rectangle
        System.out.println("Area is " + s1.getArea());
        //area is 20.0
        Shape s2 = new Triangle("blue", 4, 5);
        System.out.println(s2);
        System.out.println("area is " + s2.getArea());
    }
}
