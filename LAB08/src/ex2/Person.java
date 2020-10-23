package ex2;

public class Person {
    private String name, address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    //getters and setters
    public String getName(){
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress( String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "(" +address+ ")";
    }
}
