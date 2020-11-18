package PRACTICE.View;

import PRACTICE.Controller.studentController;

import java.util.Scanner;

public class studentView {
    public static void main(String[] args) {
        {
            studentController obj = new studentController();
            Scanner input = new Scanner(System.in);
            int choice;
            do {

                System.out.println("=== What do you want ===");
                System.out.println("1.Add student records: ");
                System.out.println("2.Display student records: ");
                System.out.println("3.Save: ");
                System.out.println("4.Exit: ");
                System.out.println("===========================");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        obj.addStudent();
                        break;
                    case 2:
                        obj.display();
                        break;
                    case 3:
                        obj.save();
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
            while (choice != 3);
        }
    }
}
