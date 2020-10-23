package ex3;

public class Point2D {
    private float x,y;

    public Point2D(){
        this.x = 0;
        this.y = 0;
    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return this.y;
    }
    public void setY(float y){
        this.y = y;
    }
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
    public float[] getXY() {
        float[] results = new float[2];
        results[0] = this.x;
        results[0] = this.y;
        return results;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
