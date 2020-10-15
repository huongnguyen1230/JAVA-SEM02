package JAVA_11;

public class Time {
    private int second, minute, hour;
    /** constructs a Time instance with the given second, minute, hour.. */

    public Time(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    /** constructs a Time instance with the default values */
    public Time(){
        this.minute = 0;
        this.hour = 0;
        this.second = 0;
    }
    //the public getters, setters for the private variable.
    /** returns the second */
    public int getSecond(){
        return this.second;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getHour(){
        return this.hour;
    }
    /** sets the second... */
    public void setSecond(int second){
        this.second = second;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    /** returns a self-descriptive...*/
    public String toString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
    public void setTime(int second, int minute, int hour){
        this.second = second;
        this.hour = hour;
        this.minute = minute;
    }
    public Time nextSecond(){
        ++second;
        if (second >= 60){
            second = 0;
            ++minute;
            if (minute >= 60){
                minute = 0;
                ++hour;
                if (hour >=24){
                    hour = 0;
                }
            }
        }
        return this;
    }
}
