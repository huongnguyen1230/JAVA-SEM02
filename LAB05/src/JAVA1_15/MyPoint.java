package JAVA1_15;

public class MyPoint {
    private int x =0;
    private int y = 0;

    public MyPoint(){

    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){ return this.x;}
    public void setX(int x){ this.x = x;}
    public int getY(){ return this.y;}
    public void setY(int y){this.y = y;}
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

    @Override
    public String toString() {
        return "x,y";
    }
    public double distance(int x, int y) {
        int xDiff = this.x -x;
        int yDiff = this.y -y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance (MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance() {return Math.sqrt(this.x*this.x + this.y*this.y);}
}
