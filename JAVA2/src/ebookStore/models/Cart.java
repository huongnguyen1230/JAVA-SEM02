package ebookStore.models;

public class Cart {
    /**models**/
    private int bookID;
    private String title;
    private double price;
    private int qty;
    private int discount;

    public Cart(){
        this.bookID = 0;
        this.title = " ";
        this.price = 0;
        this.qty = 0;
        this.discount = 0;
    }
    public Cart(int bookID, String title, double price, int qty, int discount){
        this.bookID = bookID;
        this.title = title;
        this.price = price;
        this.qty = qty;
        this.discount = discount;
    }
    public Cart(int bookID, String title, double price, int qty){
        this.bookID=bookID;
        this.title= title;
        this.price=price;
        this.qty=qty;
    }
    //setter getter

    public int getBookID() { return bookID; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    public int getQty() { return qty; }
    public int getDiscount() { return discount; }

    public void setBookID(int bookID) { this.bookID = bookID; }
    public void setTitle(String title) { this.title = title; }
    public void setPrice(double price) { this.price = price; }
    public void setQty(int qty) { this.qty = qty; }
    public void setDiscount(int discount) { this.discount = discount; }

    @Override
    public String toString() {
        return "cart{" +
                "bookID=" + bookID +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", discount=" + discount +
                '}';
    }

}
