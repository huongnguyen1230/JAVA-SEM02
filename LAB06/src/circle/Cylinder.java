package circle;

public class Cylinder extends Circle {
    private double height;

    //constructors
    public Cylinder(){
        super();
        this.height = 1.0;
        System.out.println("construced a cylinder with cylinder()");
    }
    public Cylinder(double height){
        super();
        this.height = height;
        System.out.println("construced a cylinder with cylinder(height)");
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
        System.out.println("construced a cylinder with cylinder(height, radius)");
    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
        System.out.println("construced a cylinder with cylinder(height, radius, color)");
    }
    //getters and setters
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    //
    public String toString(){
        return "this is a cylinder";
    }
}
