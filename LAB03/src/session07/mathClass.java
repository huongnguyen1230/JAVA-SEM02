package session07;

public class mathClass {
    public void add(int num1, int num2){
        System.out.println("result after addition is "+ (num1+num2));
    }
    public void add(int num1, int num2, int num3){
        System.out.println("result after addition is" +(num1+num2+num3));
    }
    public void add(float num1, int num2){
        System.out.println("result after addition is "+ (num1+num2));
    }
    public void add(int num1, float num2){
        System.out.println("result after addition is "+ (num1+num2));
    }
    public void add(float num1, float num2){
        System.out.println("result after addition is "+ (num1+num2));
    }

    public static void main(String[] args) {
        mathClass objMath = new mathClass();
        objMath.add(3.4F,2);
        objMath.add(4,5);
        objMath.add(6,7,8);
    }
}
