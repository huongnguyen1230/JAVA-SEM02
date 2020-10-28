package LAB01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class iterateOverArrayListEx {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("breaking bad");
        tvShows.add("game of thrones");
        tvShows.add("friends");
        tvShows.add("prison break");

        System.out.println("=== iterate using java 8 forEach and lambda===");
        tvShows.forEach(tvShow -> {
            System.out.println(tvShow);
        });
        System.out.println("\n == iterate using an iterator() ==");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()){
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }
        System.out.println("\n === iterate using a listIterator() to traverse in both directions ==");
        //
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()){
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }
        System.out.println("\n == iterate using simple for-each loop==");
        for (String tvShow: tvShows){
            System.out.println(tvShow);
        }
        System.out.println("\n == iterate using for loop with index");
        for (int i = 0; i < tvShows.size(); i++){
            System.out.println(tvShows.get(i));
        }
    }
}
