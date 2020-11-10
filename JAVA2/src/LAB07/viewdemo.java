package LAB07;

import LAB05.giftshop.giftController;

import java.util.Scanner;

public class viewdemo {
    public static void main(String[] args) {
        productManagement pM = new productManagement();
        Scanner input = new Scanner(System.in);
        int choice;
        do {

            System.out.println("!!!Welcome to book Gift shop!!!");
            System.out.println("=== What do you want ===");
            System.out.println("1.Add book to library");
            System.out.println("2.Delete books in library");
            System.out.println("3.Update book in library");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    pM.addBook();
                    break;
                case 2:
                    pM.deleteBook();
                    break;
                case 3:
                    pM.updateBook();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        while (choice != 4) ;
    }
}
