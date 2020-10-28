package LAB01;

import java.util.ArrayList;
import java.util.List;

public class removeElementsFromArrayListEx {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("c");
        programmingLanguages.add("c++");
        programmingLanguages.add("java");
        programmingLanguages.add("kotlin");
        programmingLanguages.add("python");
        programmingLanguages.add("perl");
        programmingLanguages.add("ruby");

        System.out.println("initial list: " + programmingLanguages);
        //remove the element at index '5'
        programmingLanguages.remove(5);
        System.out.println("after remove (5): " + programmingLanguages);

        boolean isRemoved = programmingLanguages.remove("kotlin");
        System.out.println("after remove (\"kotlin\"): " + programmingLanguages);

        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("python");
        scriptingLanguages.add("ruby");
        scriptingLanguages.add("perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("after removeAll(scriptingLanguages): " + programmingLanguages);

        //remove all the elements that satisfy the given predicate
        programmingLanguages.removeIf(n -> (n.charAt(0) == 'T'));
        //
        System.out.println("after removing all elements that start with \"c\": " + programmingLanguages);
        //remove all elements from the array list
        programmingLanguages.clear();
        System.out.println("after clear(): " + programmingLanguages);
    }
}
