package JAVA1_15.TEST;

import JAVA1_15.Author;

public class testAuthor {
    public static void main(String[] args) {
        Author au1 = new Author("jk", "jk@gmail.com", 'm');
        System.out.println(au1);

        au1.setEmail("jk@gmail.com");
        System.out.println("name is: "+ au1.getName());
        System.out.println("email is: "+ au1.getEmail());
        System.out.println("gender is: "+ au1.getGender());
    }
}
