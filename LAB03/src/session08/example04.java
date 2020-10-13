package session08;

public class example04 {
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
        mark[2][1]=75;
        mark[3][0]=75;
        mark[3][1]=50;
    }
    public void displayMarks(){
        System.out.println("Marks are:");
        for (int row =0; row<mark.length; row++){
            System.out.println("roll no." + (row+1));
            for (int col = 0; col < mark[row].length; col++){
                System.out.println(mark[row][col]);
            }
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
