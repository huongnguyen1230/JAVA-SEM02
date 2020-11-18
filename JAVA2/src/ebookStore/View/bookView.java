package ebookStore.View;

import ebookStore.controller.bookController;
import ebookStore.controller.cartController;
import ebookStore.models.Book;
import ebookStore.models.Cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bookView {
    public static void main(String[] args) {
        List<Book> book = new ArrayList<>();
        Book book1 = new Book();
        Scanner input = new Scanner(System.in);
        int choice;
        do {

            System.out.println("!!!Welcome to EbookStore!!!");
            System.out.println("=== What do you want ===");
            System.out.println("1.Insert book to library");
            System.out.println("2.Delete books in library");
            System.out.println("3.Update book in library");
            System.out.println("===========================");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter book ID: ");
                    int id = input.nextInt();
                    book1.setIdBook(id);

                    System.out.println("Enter title: ");
                    String title = input.next() ;
                    book1.setNameBook(title);

                    System.out.println("Enter Author name: ");
                    String author = input.next() ;
                    book1.setAuthor(author);

                    System.out.println("Enter qty book:");
                    int qty = input.nextInt();
                    book1.setQty(qty);

                    System.out.println("Enter price book:");
                    double price = input.nextDouble();
                    book1.setPrice(price);

                    bookController obj = new bookController();
                    boolean insert = obj.insertBook(book1);
                    if (true) {
                        break;
                    } else {
                        System.out.println();
                        break;
                    }
                case 2:



                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        while (choice != 3) ;
    }
}
