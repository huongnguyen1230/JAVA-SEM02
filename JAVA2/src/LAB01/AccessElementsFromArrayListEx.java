package LAB01;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListEx {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
        //check if an arraylist is empty
        System.out.println("is the topCompanies list empty?: " + topCompanies.isEmpty());

        topCompanies.add("google");
        topCompanies.add("apple");
        topCompanies.add("microsoft");
        topCompanies.add("amazon");
        topCompanies.add("facebook");

        //retrive the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("best company: " + bestCompany);
        System.out.println("second best company: " + secondBestCompany);
        System.out.println("last company in the list: " + lastCompany);

        //modify the element at a given index
        topCompanies.set(4, "walmart");
        System.out.println("modified top companies list: " + topCompanies);
    }
}
