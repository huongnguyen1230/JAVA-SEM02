package JAVA_11;

public class Account {
    private int number;
    private double balance;
    //the constructors
    public Account(int number){
        this.number = number;
        this.balance = 0.0;
    }
    public Account(int number, double balance){
        this.number = number;
        this.balance = balance;
    }
    /** returns the number */
    public int getNumber(){ return this.number;}
    /** returns the balance */
    public double getBalance(){ return this.balance; }
    /** returns a string description of this instance */
    public String toString(){
        return String.format("account[number r=%d, balance = $%.2f]", number, balance);
    }
    /** add the given amount to the balance */
    public void credit(double amount){
        balance += amount;
    }
    public void debit(double amount){
        if (balance >= amount){
            balance -= amount;
        }else {
            System.out.println("amount exceeded");
        }
    }
    public void transferTo(double amount, Account another){
        if (balance >= amount){
            this.balance -= amount;
            another.balance += amount;
        }else {
            System.out.println("amount exceeded");
        }
    }
}
