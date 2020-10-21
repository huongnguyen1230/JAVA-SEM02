package MARKS;

import java.util.Scanner;

public class Marks {
    int marks[][];
    int student = 0;

    public Marks() {
        this.marks = new int[4][4];
        this.student = 0;
    }

    void addStudent() {
        Scanner input = new Scanner(System.in);
        if (student < marks.length) {
            System.out.println("Enter Student ID: ");
            marks[student][0] = input.nextInt();
            System.out.println("Enter the mark of English: ");
            marks[student][1] = input.nextInt();
            System.out.println("Enter the mark of Japanese: ");
            marks[student][2] = input.nextInt();
            student++;
        } else {
            System.out.println("Cannot add more student");
        }
    }

    void displayStudent() {
        if (student > 0) {
            System.out.println("\nID \t\tEnglish \t\tJapanese");
            System.out.println("================================");
            for (int i = 0; i < student; i++) {
                System.out.printf("%d\t\t", marks[student][0]);
                System.out.printf("%d\t\t", marks[student][1]);
                System.out.printf("%d\n", marks[student][2]);
            }
        } else
            System.out.println("No student to display");
    }

    void searchByID() {
        boolean studentFound = false;
        if (student > 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Student ID you want to search for: ");
            int searchID = input.nextInt();
            System.out.println("\nID \t\tEnglish \t\tJapanese");
            System.out.println("================================");
            for (int i = 0; i < marks.length; i++) {
                if (marks[i][0] == searchID) {
                    System.out.printf("%d\t\t", marks[i][0]);
                    System.out.printf("%d\t\t", marks[i][1]);
                    System.out.printf("%d\n", marks[i][2]);
                    studentFound = true;
                    break;
                }
            }
            if (!studentFound) {
                System.out.println("Student not found");
            }
        } else
            System.out.println("No student to search");
    }

    void searchByEnglish() {
        boolean studentFound = false;
        if (student > 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the score of English you want to search for: ");
            int searchScore = input.nextInt();
            System.out.println("\nID \t\tEnglish \t\tJapanese");
            System.out.println("================================");
            for (int i = 0; i < student; i++) {
                if (marks[i][1] == searchScore) {
                    System.out.printf("%d\t\t", marks[i][0]);
                    System.out.printf("%d\t\t", marks[i][1]);
                    System.out.printf("%d\n", marks[i][2]);
                    studentFound = true;
                }
            }
            if (!studentFound) {
                System.out.println("Student not found");
            }
        } else
            System.out.println("No student to search");
    }
}

