package person;

public class testPerson {
    public static void main(String[] args) {
        Student s1 = new Student(" huong", " 1 happy ave");
        s1.addCourseGrade(" im101", 97);
        s1.addCourseGrade(" im102", 68);
        s1.printGrades();
        //
        System.out.println("average is "+s1.getAverageGrade());
        //test teacher class
        Teacher t1 = new Teacher(" JK", " 8 sunset way");
        System.out.println(t1);
        String[] courses = {" im101 ", " im102 ", " im101 "};
        for (String course: courses){
            if (t1.addCourse(course)){
                System.out.println(course + "added ");
            }else {
                System.out.println(course + "cannot be added ");
            }
        }
        for (String course: courses){
            if(t1.removeCourse(course)){
                System.out.println(course + " removed ");
            }else {
                System.out.println(course +" can not be removed ");
            }
        }
    }
}
