package session06;

public class example02 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    void changeCustomerAddress(String address) {
        customerAddress = address;
    }

    void displayCustomerInformation(){
        System.out.println("customer identification number:"+ customerID);
        System.out.println("customer identification number:"+ customerAddress);
        System.out.println("customer identification number:"+ customerAge);
        System.out.println("customer identification number:"+ customerName);
    }
}

