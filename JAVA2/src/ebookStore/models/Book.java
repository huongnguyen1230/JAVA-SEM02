package ebookStore.models;

public class Book {
    private int idBook;
    private String nameBook;
    private String author;
    private String category;
    private int years;
    private int status;
    private int qty;
    private double price;

    public Book(int idBook, String nameBook, String author, String category, double price, int qty) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.author=author;
        this.price = price;
        this.qty = qty;
        this.category = category;
    }
    public Book(){
        idBook=0;
        nameBook="";
        author="";
        price=0;
        qty=0;
        years=0;
    }

    public int getYears() {
        return years;
    }
    public int getStatus() {
        return status;
    }
    public int getIdBook() {
        return idBook;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public String getNameBook() {
        return nameBook;
    }
    public String getCategory() { return category; }

    public int getQty() {
        return qty;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
    public void setYears(int years) {
        this.years = years;
    }
    @Override
    public String toString() {
        return String.format("%-30d%-30s%-30s%-30d%-30d%-30d%-30d%-30.2f%-30s%-30s\n",idBook,nameBook,author,years,status,qty,price,category);
    }

}
