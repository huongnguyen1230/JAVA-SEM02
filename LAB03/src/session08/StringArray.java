package session08;

public class StringArray {
    String[] empID = new String[5];

    public void createArray(){
        System.out.println("creating Array. Please wait ...");
        //
        for (int count = 1; count < empID.length; count++){
            empID[count] = "E00 " + count;
        }
    }
    public void printArray(){
        System.out.println("the array is: ");
        //
        for (int count = 1; count < empID.length; count++ ){
            System.out.println("employee id is: "+ empID[count]);
        }
    }

    public static void main(String[] args) {
        StringArray objStrArray = new StringArray();
        objStrArray.createArray();
        objStrArray.printArray();
    }
}
