//package session08;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
//
//public class ArrayLists {
//
//    ArrayLists marks = new ArrayLists();
//
//    public void storeMarks() {
//        System.out.println("strong marks. Please wait...");
//        marks.add(67);
//        marks.add(50);
//        marks.add(45);
//        marks.add(75);
//    }
//
//    public void displayMarks() {
//        System.out.println("marks are:");
//
//        System.out.println("abcdefj");
//        for (int i = 0; i < marks.size(); i++) {
//            System.out.println(marks.get(i));
//        }
//        System.out.println("----------------------");
//        Iterator imarks = marks.iterator();
//        System.out.println("interating array list...");
//        while (imarks.hasNext()){
//        System.out.println(imarks.next());
//    }
//    System.out.println("------------------");
//    Collections.sort(marks);
//    System.out.println("hello"+marks);
//}
//
//    public static void main(String[] args) {
//        ArrayLists obj = new ArrayLists();
//        obj.storeMarks();
//        obj.displayMarks();
//    }
//}
