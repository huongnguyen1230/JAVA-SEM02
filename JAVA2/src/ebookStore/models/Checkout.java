package ebookStore.models;

public class Checkout {
    private Users user;
    private String email;
    private String payment;
    private String address;

    public Checkout(){
        user = null;
        email = "";
        payment = "";
        address="";
    }
    public Checkout(Users user, String email, String payment, String address){
        this.address=address;
        this.payment=payment;
        this.email=email;
        this.user=user;
    }

    public Checkout(String users, String email, String payment, String address) {
    }

    public Checkout(Users user, String email, String payment) {
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPayment() {
        return payment;
    }

    public Users getUser() {
        return user;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return String.format("%-30s%-30s%-30s%-30s",user,email,payment,address);
    }

}
