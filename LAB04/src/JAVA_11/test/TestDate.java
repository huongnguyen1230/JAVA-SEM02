package JAVA_11.test;

import JAVA_11.Date;

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(2020, 10, 14);
        System.out.println(d1);

        //test setters and getters
        d1.setYear(2001);
        d1.setMonth(12);
        d1.setDay(30);
        System.out.println(d1);
        //
        System.out.println("year is " + d1.getYear());
        //2001
        System.out.println("month is " + d1.getMonth());
        System.out.println("year is " + d1.getDay());

        //test setDate
        d1.setDate(2022, 12, 30);
        System.out.println(d1);
        //30/12/2022
    }
}
