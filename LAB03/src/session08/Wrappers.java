package session08;

public class Wrappers {
    public void calcResult(int num1, int num2, String choice){
        switch (choice){
            case "+": System.out.println("result after addition is "+
                    (num1 + num2));
            break;
            //
            case "-": System.out.println("result after subtraction is: "+
                    (num1-num2));
            break;
            case "*": System.out.println("result after multiplication is: "+
                    (num1*num2));
                break;
            case "/": System.out.println("result after division is: "+
                    (num1/num2));
                break;
        }
    }

    public static void main(String[] args) {
        if (args.length == 3){
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            //
            Wrappers objWrap = new Wrappers();
            objWrap.calcResult(num1, num2, args[2]);
        }
        else {
            System.out.println("usage: num1 num2 operator");
        }
    }
}
