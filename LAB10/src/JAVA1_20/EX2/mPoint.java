package JAVA1_20.EX2;

import JAVA1_19.ex4.movable;

public class mPoint implements movable {
    private int x,y, xSpeed, ySpeed;

    public mPoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "movablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void moveUp() {
        y-= ySpeed;
    }
    @Override
    public void moveDown() {
        y+= ySpeed;
    }
    @Override
    public void moveLeft() {
        x-= xSpeed;
    }
    @Override
    public void moveRight() {
        x+= xSpeed;
    }
}
