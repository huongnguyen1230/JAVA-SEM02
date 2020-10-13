package session08;

public class OneDimension {
    int mark[];
    public void storeMarks(){
        mark = new int[4];
        System.out.println("Storing Marks. Please wait...");
        //
        mark[0]=65;
        mark[1]=47;
        mark[2]=75;
        mark[3]=50;
    }
    public void displayMarks(){
        System.out.println("marks are:");
        //
        System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        System.out.println(mark[3]);
    }
    public static void main(String[] args) {
        OneDimension oneDimenObj = new OneDimension();
        oneDimenObj.storeMarks();
        oneDimenObj.displayMarks();
    }
}
