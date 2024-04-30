package OOPSinJAVA;

 // Method Overriding // Run time Polymorphism
class Person{
    void eat(){
        System.out.println("Non Vegetarian");
    }
}

class Mom extends Person {
    void eat(){
        System.out.println("Vegetarian");
    }

}

public class OOPS8 {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();
        Mom m = new Mom();
        m.eat();

    }
}
