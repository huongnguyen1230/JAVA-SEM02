package exercise2;

public class Flight {
    private int number;
    private String destination;

    public Flight(){
        this.number = 0;
        this.destination = "";
    }
    public Flight(int number, String destination){
        this.number = number;
        this.destination = destination;
    }
    public void display(){
        System.out.println("Number flight: " + number);
        System.out.println("Destination: " + destination);
    }
    public int getNumber() {
        return number;
    }
    public String getDestination() {
        return destination;
    }
}
