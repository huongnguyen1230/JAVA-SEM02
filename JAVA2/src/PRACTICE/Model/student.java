package PRACTICE.Model;

public class student {
    private String studentID;
    private String studentName;
    private String address;
    private int phone;

    public student(){
        this.studentID = " ";
        this.studentName = " ";
        this.address = " ";
        this.phone = 0;
    }
    public student( String studentID, String studentName, String address, int phone){
        this.studentID = studentID;
        this.studentName = studentName;
        this.address = address;
        this.phone = phone;
    }
    //setter & getter


    public String getStudentID() { return studentID; }
    public String getStudentName() { return studentName; }
    public String getAddress() { return address; }
    public int getPhone() { return phone; }

    public void setStudentID(String studentID) { this.studentID = studentID; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public void setAddress(String address) { this.address = address; }
    public void setPhone(int phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "Student: " +
                "studentID= " + studentID + "\n" +
                ", studentName= " + studentName + "\n" +
                ", address= " + address + "\n" +
                ", phone= " + phone;
    }
}
