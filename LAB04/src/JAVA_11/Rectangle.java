package JAVA_11;

public class Rectangle {
    private float length;
    private float width;
    //
    public Rectangle(){
        length = 1.0f;
        width = 1.0f;
    }
    public Rectangle( float length, float width){
        this.length = length;
        this.width = width;
    }
    public float getLength(){ return this.length;}
    public void setLength(float length){this.length = length;}
    //
    public float getWidth(){ return this.width;}
    public void setWidth(float width){this.width = width;}
    //
    public double getArea(){ return width*length;}
    public double getPerimeter(){ return width * length * Math.PI;}
    //
    public String toString(){ return String.format("rectangle[ length = 2%f, width = 2%f", length,width);}
}
