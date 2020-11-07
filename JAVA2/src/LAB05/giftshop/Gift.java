package LAB05.giftshop;

public class Gift {
    private int id;
    private String name;
    private String author;
    private double price;
    private int qty;

    public Gift(int id, String name,String author, double price, int qty){
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public Gift(){
        this.id = 0;
        this.name = " ";
        this.author = " ";
        this.price = 0;
        this.qty = 0;
    }

    //getter & setter
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }

///////////
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
