package JAVA1_15.TEST;

import JAVA1_15.Author;
import JAVA1_15.Book;

public class testBook {
    public static void main(String[] args) {
        Author au1 = new Author("JK", "jk@gmail.com", 'm');
        System.out.println(au1);

        Book dummyBook = new Book("java for dummy", au1, 19.95, 99);
        System.out.println(dummyBook);
        //getters and setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is " + dummyBook.getName());
        System.out.println("price is " + dummyBook.getPrice());
        System.out.println("qty is " + dummyBook.getQty());
        System.out.println("Author is " + dummyBook.getAuthor());
        System.out.println("author's name is " + dummyBook.getAuthor().getName());
        System.out.println("author's email is " + dummyBook.getAuthor().getEmail());
        //
        Book anotherBook = new Book("more java", new Author("abc","abc@gmail.com",
                'f'),29.95);
        System.out.println(anotherBook);

    }
}
