package session06;

public class example01 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    public static void main(String[] args) {
        example01 objCustomer1 = new example01();
        objCustomer1.customerID = 100;
        objCustomer1.customerName = "John";
        objCustomer1.customerAddress = "123 street";
        objCustomer1.customerAge = 30;

        System.out.println("customer identification number:"+ objCustomer1.customerID);
        System.out.println("customer identification number:"+ objCustomer1.customerAddress);
        System.out.println("customer identification number:"+ objCustomer1.customerAge);
        System.out.println("customer identification number:"+ objCustomer1.customerName);
    }
}
