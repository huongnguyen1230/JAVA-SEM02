package JAVA_11;

public class Date {
    private int year, month, day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //the public getter, setters for the private variables
    /** return the year */
    public int getYear(){
        return this.year;
    }
    /**..*/
    public int getMonth(){
        return this.month;
    }
    /**..*/
    public int getDay(){
        return this.day;
    }
    /** set year, no input validation */
    public void setYear(int year){
        this.year = year;
    }
    /** set month, no input validation */
    public void setMonth(int month){
        this.month = month;
    }
    /** set day, no input validation */
    public void setDay(int day){
        this.day = day;
    }
    // return a descriptive string in the form "m/d/y" with leading zero
    public String toString(){
        return String.format("%02d/%02d/%04d", month, day, year);
    }
    public void setDate(int year, int month, int day){
       this.year = year;
       this.month = month;
       this.day = day;
    }

}
