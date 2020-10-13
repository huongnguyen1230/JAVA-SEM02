package session08;

public class example06 {
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
    public void totalMarks(){
        System.out.println("total marks are:");

        for (int row=0; row< mark.length; row++){
            System.out.println("roll no." + (row+1));
            int sum = 0;
            for (int value:mark[row]){
                sum = sum +value;
            }
            System.out.println(sum);
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
