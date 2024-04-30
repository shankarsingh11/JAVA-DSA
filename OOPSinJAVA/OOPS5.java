package OOPSinJAVA;
// INHERITANCE PROPERTIES
// Multilevel
// base class
class Animal{

    String color;
     void eat(){
         System.out.println("Eats");
     }
     void breathe(){
         System.out.println("Breathing");
     }
}
// Derived class / subclass

class Mammal extends  Animal{
       int legs;
}

class Dog extends  Mammals{
    String bread;
}



public class OOPS5 {

    public static void main(String[] args) {
  Dog doggy = new Dog();
    doggy.bread = "German shafered";
    doggy.eat();
        System.out.println(doggy.bread);
    }
}
