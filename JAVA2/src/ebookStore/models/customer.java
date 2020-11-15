package ebookStore.models;

public class customer {
    private String idCus;
    private String nameCus;
    private String address;
    private String email;
    private String phone;

    public customer(){
        idCus= " ";
        nameCus="";
        address="";
        email="";
        phone="";
    }
    public customer(String idCus,String nameCus,String address,String email,String phone){
        this.email=email;
        this.idCus = idCus;
        this.phone=phone;
        this.nameCus =nameCus;
        this.address=address;
    }
//setter getter

    public String getIdCus() { return idCus; }
    public String getNameCus() {
        return nameCus;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }





    public void setNameCus(String nameCus) {
        this.nameCus = nameCus;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIdCus(String idCus) { this.idCus = idCus; }

    @Override
    public String toString() {
        return String.format("%-30d%-30s%-30s%-30s%-30s%-30d%-30s%-30s",idCus,nameCus,address,email,phone);
    }
}
