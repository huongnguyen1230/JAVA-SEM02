package session07;

public class employee {
    int empID;
    String empName;
    private String SSN;
    protected String empDesig;
    //
    public employee(int ID, String name){
        empID = ID;
        empName = name;
    }
    public String getSSN(){
        return SSN;
    }
    public void setSSN(String ssn){
        SSN = ssn;
    }
    public void setEmpDesignation(String desig){
        empDesig = desig;
    }
    public void display(){
        System.out.println("employee id is"+ empID);
        System.out.println("employee name is"+ empName);
        System.out.println("designation is"+ empDesig);
        System.out.println("SSN is"+ SSN);
    };

    public static void main(String[] args) {
        employee objEmp1 = new employee(1200, "abc");
        objEmp1.empDesig = "manager";
        objEmp1.SSN = "123-456-789";
        objEmp1.display();
    }
}
