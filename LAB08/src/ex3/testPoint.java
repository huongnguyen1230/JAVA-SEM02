package ex3;

public class testPoint {
    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        System.out.println("x= " + p1.getX() + " y = " + p1.getY() + " z = "+p1.getZ());
        Point3D p2 = new Point3D(1,2,3);
        System.out.println("x= " + p2.getX() + " y = " + p2.getY() + " z = "+p2.getZ());
    }
}
