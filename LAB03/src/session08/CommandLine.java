package session08;

public class CommandLine {
    public static void main(String[] args) {
        if (args.length ==3){
            //
            System.out.println("first name is: "+ args[0]);
            System.out.println("last name is: "+ args[1]);
            System.out.println("designation is: "+ args[2]);
        }
        else {
            System.out.println("specify the first nam, last name, designation ");
        }
    }
}
