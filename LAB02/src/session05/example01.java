package session05;

public class example01 {
    public static void main(String[] args) {
        int num = 1; //khai bao bien & gan gia tri
        int product = 0;
        //
        while (num <=5){
            product = num*10;
            System.out.printf("\n%d*10 = %d", num,product);
            num++;
        }
        System.out.printf("\nOutside the Loop");
    }
}
