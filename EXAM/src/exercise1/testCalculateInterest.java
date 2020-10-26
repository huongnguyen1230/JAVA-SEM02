package exercise1;

public class testCalculateInterest {
    public static void main(String[] args) {
        Bank b1 = new Bank(1000, 10);
        System.out.println("The money interest is: ");
        System.out.printf("%.2f", b1.calculateInterest());
    }
}
