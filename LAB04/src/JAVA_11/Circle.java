package JAVA_11;

public class Circle {
    private  double radius;
    private String color;
    //
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    //
    public Circle( double r){
        radius = r;
        color = "red";
    }
    //add 3rd constructor
    public Circle( double r, String c){
        radius= r;
        color = c;
    }
    public Circle(String c){
        radius = 1.0;
        color = c;
    }
    //
    public double getRadius(){
        return  radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    //add getter string getColor
    public String getColor(){
        return color;
    }

}
