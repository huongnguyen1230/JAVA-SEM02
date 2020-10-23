package ex5;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public  Rectangle(){
        super("red", true);
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle( double width, double length){
        super();
        this.length = length;
        this.width = width;
    }
    public Rectangle( double width, double length, String color, boolean filled){
        super( color, filled);
        this.width = width;
        this.length = length;
    }
    public double getLength(){ return this.length;}
    public void setLength(double length){this.length = length;}
    //
    public double getWidth(){ return this.width;}
    public void setWidth(double width){this.width = width;}
    //
    public double getArea(){ return width*length;}
    public double getPerimeter(){ return width * length * Math.PI;}

    @Override
    public String toString() {
        return "Rectangle[Shape" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
