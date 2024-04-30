package OOPSinJAVA;
import java.util.*; // all package access
// import java.util.Scanner; // only scanner package access

public class StudentClass {

    // Creating a  user defined new data type

//    public static class Student {
//        String name;
//        private int rno;
//        double percent;
//
//    }

//    public static  class Car{
//        String name;
//        String type;
//        String color;
//        int price;
//    }

//    public  static  void  fun(Student x){
//        System.out.println(x.name);
//    }

//    public  static  String change(Student x){
//        x.name = "Suraj singh";
//        return x.name;
//    }
    public static void main(String[] args) {

//        int x = 5;
//        System.out.println(x); // 5
//        change(x);
//        System.out.println(x); // 5


//        Car c1 = new Car();
//        c1.name = "Alto";
//        c1.color = "red";
//        c1.price = 500000;

        //System.out.println(c1.color);

       //  Scanner sc = new Scanner(System.in);
        // objects are instance of class
        // creating a object s1(instance)
        // objects are real life entities
        Student s1 = new Student();

        s1.name = "James";
      //  s1.rno = 115;
        s1.percent = 87.5;
        s1.setRno(10);
        System.out.println(s1.getRno());



       // default values
//        System.out.println(s1.name); // null
//        System.out.println(s1.rno); // 0
//        System.out.println(s1.percent); // 0.0
//        s1.name = "shankar singh";
//        s1.rno = 100;
//        s1.percent = 95.6;
//        System.out.println(s1.name);
//       // change(s1);
//        System.out.println(s1.name);

        // System.out.println(s1); nothing printed but run
        //System.out.println(s1.name);
       // System.out.println(s1.rno + 8); // 108

        // creating  object s2
        // class name object name = new class name ()

//        Student s2 = new Student();
//        s2.name = "Raghav";
//        s2.rno = 75;
//        s2.percent = 85.7;
        // System.out.println(s2.percent);

        // function call
       // fun(s1);
    }
}
