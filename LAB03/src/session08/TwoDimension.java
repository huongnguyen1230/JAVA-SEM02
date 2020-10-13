package session08;

public class TwoDimension {
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
    public void displayMarks(){
        System.out.println("Mark are:");
        //
        System.out.println("roll no.1:" + mark[0][0]+","+mark[0][1]);
        System.out.println("roll no.2:" + mark[1][0]+","+mark[1][1]);
        System.out.println("roll no.3:" + mark[2][0]+","+mark[2][1]);
        System.out.println("roll no.1:" + mark[3][0]+","+mark[3][1]);
    }

    public static void main(String[] args) {
        TwoDimension twoDimenObj = new TwoDimension();
        //
        twoDimenObj.storeMarks();
        //
        twoDimenObj.displayMarks();
    }
}
