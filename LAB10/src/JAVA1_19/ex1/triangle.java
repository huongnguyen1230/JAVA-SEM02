package JAVA1_19.ex1;

public class triangle extends Shape {
    private int base, height;

    public triangle(String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle[ base= " + base + " height=" + height +
                super.toString() + "]";
    }
    public  double getArea(){
        return 0.5 * base * height;
    }
}
