package ex3;

import ex2.Person;

public class Point3D extends Point2D{
    private float z;

    public Point3D(){
        super();
        z = 0.0f;
    }
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public float[] getXYZ() {
        float[] results = new float[3];
        results[0] = this.getY();
        results[0] = this.getX();
        results[0] = this.z;
        return results;
    }
   public void setXYZ(float x, float y, float z) {
        this.z = z;
   }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
