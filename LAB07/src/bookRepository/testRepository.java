package bookRepository;

import java.util.Scanner;

public class testRepository {
    Book[] books;
    byte bookCount;

    public testRepository() {
        this.bookCount = 0;
    }

    public static void main(String[] args) {
        byte numberOfBooks = Byte.parseByte(args[0]);
        testRepository objRepository = new testRepository();
        objRepository.books = new Book[numberOfBooks];
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n Welcome to E-Repository.\n"+
                    "Select the operation that you want to perform:");
            System.out.println("***********************************************************");
            System.out.println("1. Add book to the repository");
            System.out.println("2. Search book by book name");
            System.out.println("3. Display books");
            System.out.println("4. Exit");
            System.out.println("***********************************************************");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    objRepository.addBook();
                    break;
                case 2:
                    objRepository.searchByBookName();
                    break;
                case 3:
                    objRepository.displayBooks();
                    break;
                case 4:
                    break;
                default:
                    System.out.println(" Not a valid Choice ");
            }
        } while (choice != 4);
        System.out.println(objRepository.toString());
    }

    void addBook() {
        Scanner input = new Scanner(System.in);
        if (bookCount < books.length) {
            books[bookCount] = new Book();
            //accept book name, author name, isbn, price, year...
            System.out.println("Enter name of book: ");
            books[bookCount].name = input.nextLine();
            System.out.println("Enter author name: ");
            books[bookCount].authorName = input.nextLine();
            System.out.println("Enter ISBN of book: ");
            books[bookCount].isbn = input.nextInt();
            System.out.println("Enter the price of book: ");
            books[bookCount].price = input.nextFloat();
            System.out.println("Enter the publish year: ");
            books[bookCount].yearPublished = input.nextShort();
            bookCount++;
        } else {
            System.out.println("sorry, unable to add book");
        }
    }

    void displayHeader() {
        System.out.format("%1$ - 10s %2$ - 25s %3$ - 25s %4$ - 10s %5$ - 10s",
                "ISBN", "Book Name", "Author Name", "Price($)", "Year of " + "Publication");
    }

    void searchByBookName()

    {
        Scanner input = new Scanner(System.in);
        String bookName = "";
        //
        boolean bookFound = false;
        //
        if (bookCount > 0) {
            System.out.format("enter the book name to search for: ");
            bookName = input.nextLine();
            displayHeader();
            System.out.format("\n---------------------------------------------------" +
                    "---------------------------------------------------------------");
            //
            for (int rowIndex = 0; rowIndex < bookCount; rowIndex++) {
                if (books[rowIndex].name.indexOf(bookName) != 1) {
                    System.out.format("%1$ - 10d %2$ - 25s %3$ - 25s %4$ - 10.2s %5$ - 10d",
                            books[rowIndex].isbn, books[rowIndex].name,
                            books[rowIndex].authorName, books[rowIndex].price,
                            books[rowIndex].yearPublished);
                    bookFound = true;
                }
            }
            //
            if (!bookFound)
                System.out.println("\n book not found.");
        } else {
            System.out.println("\n No book to search");
        }
    }

    void displayBooks() {
        if (bookCount > 0) {
            displayHeader();
            System.out.println("___________________________________________________________" +
                    "___________________________________________________________________");
            for (int rowIndex = 0; rowIndex < bookCount; rowIndex++) {
                System.out.format("\n%1$-10d %2$-25s %3$-25s %4$-10.2f %5$-10d",
                        books[rowIndex].isbn, books[rowIndex].name,
                        books[rowIndex].authorName, books[rowIndex].price,
                        books[rowIndex].yearPublished);
            }
        }
    }
}