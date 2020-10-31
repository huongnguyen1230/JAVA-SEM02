package LAB02.JAVA2_3.EX1;

public class Contact {
    private String name;
    private String phone;
/**c constructor */
    public Contact(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    public static Contact createContact(String name, String phone){
        return new Contact(name, phone);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
