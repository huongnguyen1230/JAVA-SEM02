package JAVA_11;

public class Point {
    private int x,y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    /** return value of x */
    public int getX(){ return this.x;}
    /** sets value of x */
    public void setX(int x){ this.x = x; }
    /** return value of y */
    public int getY(){ return this.y; }
    /** sets value of y */
    public void setY(int y){ this.y = y;}

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
    public int[] getXY() {
        int[] results = new int[2];
        results[0] = this.x;
        results[0] = this.y;
        return results;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance(int x, int y) {
        int xDiff = this.x -x;
        int yDiff = this.y -y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance (Point another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance() {return Math.sqrt(this.x*this.x + this.y*this.y);}

}
