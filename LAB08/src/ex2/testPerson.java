package ex2;

public class testPerson {
    public static void main(String[] args) {
        Student s1 = new Student("JK", "korea", "hello", 2020, 500);
        System.out.println("name " + s1.getName() +" address "+s1.getAddress()
                + " program "+ s1.getProgram() + " year "+ s1.getYear() + " fee" + s1.getFee() );
    }
}
