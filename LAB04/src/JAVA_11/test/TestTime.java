package JAVA_11.test;

import JAVA_11.Time;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(1,2,3);
        System.out.println(t1);
        Time t2 = new Time();
        System.out.println(t2);

        //test setters, getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);
        //
        System.out.println("hour is: " + t1.getHour());
        System.out.println("minute is: " + t1.getMinute());
        System.out.println("second is: " + t1.getSecond());
        //test setTime()

        t1.setTime(58,59,23);
        System.out.println(t1);
        //test nextSecond and chaining

        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
    }
}
