package LAB01;

import java.util.ArrayList;
import java.util.List;

class user {
    private String name;
    private int age;
    public user(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class ArrayListUserDefinedObjectExample{
    public static void main(String[] args) {
        List<user> users = new ArrayList<>();
        users.add(new user("ken", 25));
        users.add(new user("john", 35));
        users.add(new user("steve", 27));

        users.forEach(user -> {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        });
    }
}
