package LAB01;

import java.util.ArrayList;
import java.util.List;

public class createArrayListEx {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        //add new elements
        animals.add("lion");
        animals.add("tiger");
        animals.add("cat");
        animals.add("dog");

        System.out.println(animals);
        //adding an element at a particular index in
        animals.add(2, "elephant");

        System.out.println(animals);
    }
}
