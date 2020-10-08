package session06;

public class example06 {
    private int width;
    private int height;

    public example06(){
        System.out.println("hello...");
        width=10;
        height=10;
    }
    public example06(int wid, int heig){
        System.out.println("good...");
        width = wid;
        height = heig;
    }
    private void displayDimension(){
        System.out.println(width);
        System.out.println(height);
    }
}
