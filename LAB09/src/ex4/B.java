package ex4;

public class B extends A {
    public B(){
        super();
        System.out.println("constructed an instance of B");
    }

    @Override
    public String toString() {
        return " this is B";
    }
}
