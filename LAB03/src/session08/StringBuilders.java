package session08;

public class StringBuilders {
    StringBuilder str = new StringBuilder("JAVA");
    //
    public void displayStrings(){
        System.out.println("appended string is "+ str.append("7"));
        System.out.println("inserted string is "+ str.insert(5, "SE"));
        System.out.println("deleted string is "+ str.delete(4,7));
        System.out.println("reverse string is "+ str.reverse());
    }

    public static void main(String[] args) {
        StringBuilders objStrBuild = new StringBuilders();

        objStrBuild.displayStrings();
    }
}
