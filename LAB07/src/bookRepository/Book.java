package bookRepository;

public class Book {
     String name;
     String authorName;
     int isbn;
     float price;
     short yearPublished;


    public Book(){
        this.name = "";
        this.authorName = "";
        this.isbn = 0;
        this.price = 0;
        this.yearPublished = 0;

    }
        //getters
    public String getName(){ return this.name;}
    public String getAuthorName(){return this.authorName;}
    public float getPrice(){ return this.price;}
    public int getIsbn(){ return this.isbn;}
    public short getYearPublished(){ return this.yearPublished;}
    //setters
    public void setPrice(float price){ this.price = price;}
    public void setName(String name){this.name = name;}
    public void setAuthorName(String authorName){this.authorName = authorName;}
    public void setIsbn(int isbn){this.isbn = isbn;}
    public void setYearPublished(short yearPublished){this.yearPublished = yearPublished;}


}
