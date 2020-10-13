package session08;

public class AutoBox {
    public static void main(String[] args) {
        Character chBox = 'A';
        char chUnbox = chBox;
        //
        System.out.println("character after autoboxing is "+ chBox);
        System.out.println("character after unboxing is " + chUnbox);
    }
}
