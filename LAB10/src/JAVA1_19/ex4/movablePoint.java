package JAVA1_19.ex4;

public class movablePoint implements movable {
    private int x,y;

    public movablePoint(int x, int y){
        this.x = x;
        this.y = y;
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
        y--;
    }
    @Override
    public void moveDown() {
        y++;
    }
    @Override
    public void moveLeft() {
        x--;
    }
    @Override
    public void moveRight() {
        x++;
    }
}
