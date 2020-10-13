package session07;

public class example01 {
     public void add(int num1, int num2){
         int num3;
         num3 = num1 + num2;
         System.out.println("result after addition is "+ num3);
     }
     public void sub(int num1, int num2){
         int num3 ;
         num3 = num1 + num2;
         System.out.println("result after subtraction is "+ num3);
     }
     public void mul(int num1, int num2){
         int num3;
         num3 = num1+num2;
         System.out.println("result after multiplication is" + num3);
     }
     public void div(int num1, int num2){
         int num3;
         num3 =num1/num2;
         System.out.println("result after division is" + num3);
     }

    public static void main(String[] args) {
        example01 objCalc = new example01();
        objCalc.add(3,4);
        objCalc.mul(3,4);
    }
}
