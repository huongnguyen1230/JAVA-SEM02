package JAVA1_19.ex3;

public class triangle implements Shape{
    private int base, height;

    public triangle(int base, int height){
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
