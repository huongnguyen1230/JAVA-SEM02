package LAB01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class arrayListSortEx {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("huong");
        names.add("jungkook");
        names.add("army");
        names.add("bangtan");

        System.out.println("name: " + names);

        //sort an arraylist using its sort() method. you must pass a comparator
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });
        names.sort((name1, name2) -> name1.compareTo(name2));
        //following is an even more concise solution
        names.sort(Comparator.naturalOrder());

        System.out.println("sorted names: " + names);
    }
}
