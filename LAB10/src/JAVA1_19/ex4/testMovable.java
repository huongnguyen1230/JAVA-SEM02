package JAVA1_19.ex4;

public class testMovable {
    public static void main(String[] args) {
        movablePoint p1 = new movablePoint(1,2);
        System.out.println(p1);
        //
        p1.moveDown();
        System.out.println(p1);
        //
        p1.moveRight();
        System.out.println(p1);

        movable p2 = new movablePoint(3,4);
        p2.moveUp();
        System.out.println(p2);

        movablePoint p3 = (movablePoint)p2;
        System.out.println(p3);
    }
}
