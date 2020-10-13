package session07;

public class varargs {
   public void addNumber(int...num){
       int sum = 0;

       for(int i:num){
           sum=sum+i;
       }
       System.out.println("Sum of numbers is " + sum);
   }
    public static void main(String[] args) {
    varargs obj = new varargs();
    obj.addNumber(10,30,20,40);
    }
}
