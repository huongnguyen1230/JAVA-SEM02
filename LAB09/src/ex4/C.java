package ex4;

public class C extends B {
    public C(){
        super();
        System.out.println("constructed an instance of C");
    }

    @Override
    public String toString() {
        return " this is C";
    }
}
