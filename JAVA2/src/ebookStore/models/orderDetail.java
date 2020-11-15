package ebookStore.models;

public class orderDetail {
    private int id;
    private String nameBook;
    private int idBook;
    private String idCus;
    private double price;
    private int qty;
    private int status;
    private int amount;

    public orderDetail(){
        this.id = 0;
        this.nameBook = " ";
        this.idBook = 0;
        this.idCus = " ";
        this.price = 0;
        this.qty = 0;
        this.status = 0;
        this.amount = 0;
    }
    public orderDetail(int id, String nameBook, int idBook,String idCus, double price, int qty, int status, int amount){
        this.id = id;
        this.idBook = idBook;
        this.idCus = idCus;
        this.nameBook = nameBook;
        this.price = price;
        this.qty = qty;
        this.status = status;
        this.amount = amount;
    }
    public orderDetail(int id, String idCus, double price, int status){
        this.id = id;
        this.idCus = idCus;
        this.price = price;
        this.status = status;
    }

    //getter setter

    public int getId() { return id; }
    public String getIdCus() { return idCus; }
    public int getIdBook() { return idBook; }
    public String getNameBook() { return nameBook; }
    public double getPrice() { return price; }
    public int getQty() { return qty; }
    public int getStatus() { return status; }
    public int getAmount() { return amount; }


    public void setId(int id) { this.id = id; }
    public void setIdCus(String idCus) { this.idCus = idCus; }
    public void setIdBook(int idBook) { this.idBook = idBook; }
    public void setNameBook(String nameBook) { this.nameBook = nameBook; }
    public void setPrice(double price) { this.price = price; }
    public void setQty(int qty) { this.qty = qty; }
    public void setStatus(int status) { this.status = status; }
    public void setAmount(int amount) { this.amount = amount; }
}
