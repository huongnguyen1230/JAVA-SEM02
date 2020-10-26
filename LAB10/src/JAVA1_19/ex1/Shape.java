package JAVA1_19.ex1;

abstract public class Shape {
    public String color;

    public Shape(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape[" +
                "color=" + color + "]";
    }
    abstract public double getArea();
}
