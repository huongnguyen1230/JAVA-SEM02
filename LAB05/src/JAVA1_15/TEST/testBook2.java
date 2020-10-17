package JAVA1_15.TEST;

import JAVA1_15.Author;
import JAVA1_15.Book2;

public class testBook2 {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("abc","abc@gmail.com", 'm' );
        authors[1] = new Author("hello","hello@gmail.com", 'm' );

        Book2 javaDummy = new Book2("java for Dummy", authors,19.99, 99);
        System.out.println(javaDummy);
    }
}
