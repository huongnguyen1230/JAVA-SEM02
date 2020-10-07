package session04;

public class example03 {
    public static void main(String[] args) {
        int totalMarks = 59;

        if (totalMarks > 90){
            System.out.println("A+");
        }else if (totalMarks >=60){
            System.out.println("A");
        }else if (totalMarks >=40){
            System.out.println("B");
        }else
            System.out.println("Fail");
    }
}
