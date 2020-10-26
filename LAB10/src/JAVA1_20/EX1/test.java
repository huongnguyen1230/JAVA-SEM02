package JAVA1_20.EX1;

public class test {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.greeting();
        dog d1 = new dog();
        d1.greeting();
        bigdog bd1 = new bigdog();
        bd1.greeting();

        animal a1 = new cat();
        a1.greeting();
        animal a2  = new dog();
        a2.greeting();
        animal a3 = new bigdog();
        a3.greeting();
//        animal a4 = new animal();

        dog d2 =  (dog)a2;
        bigdog bd2 =(bigdog)a3;
        dog d3 =(dog)a3;
        cat c2 =(cat) a2;
        d2.greeting(d3);
        d3.greeting(d2);
        d2.greeting(d2);
        bd2.greeting(d2);
        bd2.greeting(d1);
    }
}
