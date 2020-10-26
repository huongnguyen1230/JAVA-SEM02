package JAVA1_19.ex1;

public class rectangle extends Shape {
    private int length, width;

    public rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[ length= " + length + " width= " + width +
                super.toString() + "]";
    }
    public double getArea(){
        return length* width;
    }
}
