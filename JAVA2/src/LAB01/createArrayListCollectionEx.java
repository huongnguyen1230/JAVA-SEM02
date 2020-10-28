package LAB01;

import java.util.ArrayList;
import java.util.List;

public class createArrayListCollectionEx {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        //create an arraylist from another collection
        List<Integer> firstTenPrimeNumber = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        //adding an entire collection to an arraylist
        firstTenPrimeNumber.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumber);
    }
}
