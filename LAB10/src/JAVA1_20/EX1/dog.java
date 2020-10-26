package JAVA1_20.EX1;

public class dog extends animal{
    @Override
    public void greeting() {
        System.out.println("woof");
    }
    public void greeting( dog another){
        System.out.println("wooooo");
    }
}
