package session08;

public class Strings {
    String str = "Hello";
    Integer strLength = 5;
    //
    public void displayStrings(){
        System.out.println("string length is:" + str.length());
        System.out.println("character at index2 is:" + str.charAt(2));
        System.out.println("concatenated string is:" + str.concat("world"));
        System.out.println("string comparison is:" + str.compareTo("world"));
        System.out.println("index of o is:" + str.indexOf("o"));
        System.out.println("last index of 1 is:" + str.lastIndexOf("1"));
        System.out.println("replaced string is:" + str.replace('e','a'));
        System.out.println("substring is:" + str.substring(2,5));
        System.out.println("integer to string is:" + strLength.toString());
        String str1 = "hello";
        System.out.println("untrimmed string is:" +strLength);
        System.out.println("trimmed string is:" +str1.trim());

    }
    public static void main(String[] args) {
    Strings objString = new Strings();
    objString.displayStrings();
    }
}
