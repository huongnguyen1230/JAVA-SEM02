package session07;

public class student {
    int rollNo;
    String name;
    String address;
    float marks;
    //
    public student(){
        rollNo = 0;
        name = "";
        address = "";
        marks = 0;
    }
    public student(int rNo, String sname){
        rollNo = rNo;
        name = sname;
    }
    public student(int rNo, float score){
        rollNo = rNo;
        marks = score;
    }
    public student (String sName, String addr){
        name = sName;
        address = addr;
    }
    public student(int rNo, String sname, float score){
        rollNo = rNo;
        name = sname;
        marks = score;
    }
    public void displayDetails(){
        System.out.println("Rollno"+ rollNo);
        System.out.println("Student name"+ name);
        System.out.println("Address"+ address);
        System.out.println("Score"+ marks);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        student objStud1 = new student("david","123, abc");
        objStud1.displayDetails();
        //
        student objStud2 = new student(103,46);
        objStud2.displayDetails();
        //
        student objStud3 = new student(104, "abc", 50);
        objStud3.displayDetails();
    }
}
