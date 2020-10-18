package point2_3D;

public class Point2D {
    private int x,y;

    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    //getters and setters
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }
    /** returns a self-descriptive string in the form of "(x,y)" */
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}
