package JAVA1_15;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle(){
        center = new MyPoint(0,0);
        this.radius = 1;
    }
    public MyCircle(int x, int y, int radius){
        center = new MyPoint(x,y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
    //getters and setters
    public int getRadius(){ return this.radius;}
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setCenterX(MyPoint center){
        this.center = center;
    }public int getCenterX(){
        return center.getX();
    }

}
