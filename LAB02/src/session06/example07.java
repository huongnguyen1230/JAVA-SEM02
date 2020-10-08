package session06;

public class example07 {
    int width;
    int height;

    example07(){
        System.out.println("hello");
        width=10;
        height=10;
    }
    example07(int wid, int heig){
        System.out.println("hihi");
        width = wid;
        height = heig;
    }
    void displayDimensions(){
        System.out.println("Width:" + width);
        System.out.println("height:"+height);
    }
}
