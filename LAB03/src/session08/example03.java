package session08;

public class example03 {
    int mark[][];

    public void storeMarks(){
        mark = new int[4][2];
        System.out.println("storing marks. please wait...");
        //
        mark[0][0]=23;
        mark[0][1]=65;
        mark[1][0]=42;
        mark[1][1]=47;
        mark[2][0]=60;
    }
    public void displayMark(){
        System.out.println("marks are:");
        //
        for (int count =0; count<mark.length; count++){
            System.out.println(mark[count]);
        }
    }
    public static void main(String[] args) {
        TwoDimension twoDimenObj = new TwoDimension();
        //
        twoDimenObj.storeMarks();
        //
        twoDimenObj.displayMarks();
    }
}
