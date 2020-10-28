package LAB01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
    private String name;
    private Integer age;

    public Person(String name, Integer age){
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class arrayListObjectSortEx {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("sachin", 47));
        people.add(new Person("chris", 34));
        people.add(new Person("rejeev", 25));
        people.add(new Person("david", 31));

        System.out.println("person list: " + people);
        //sort
        people.sort((person1, person2) ->{
            return person1.getAge() - person2.getAge();
        });
        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("sorted person list by age: " + people);
        //
        Collections.sort(people, Comparator.comparing(Person::getAge));
    }
}
