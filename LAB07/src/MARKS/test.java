package MARKS;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        Marks obj = new Marks();
        do{
            System.out.println("\nWelcome to E-Repository.\n Select the question you want to perform: ");
            System.out.println("***********************************************************************");
            System.out.println("1. Add student to repository");
            System.out.println("2. Search student by Student ID");
            System.out.println("3. Search student by English score");
            System.out.println("4. Display book details");
            System.out.println("5. Exit");
            System.out.println("***********************************************************************");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    obj.addStudent();
                    break;
                case 2:
                    obj.searchByID();
                    break;
                case 3:
                    obj.searchByEnglish();
                    break;
                case 4:
                    obj.displayStudent();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(choice!=5);
    }
}

