package JAVA1_19.ex3;

public class rectangle implements Shape{
    private int length, width;

    public rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
    @Override
    public double getArea() {
        return 0;
    }
}
