package OOPSinJAVA;

// Abstraction Concept

abstract class Animal_1{
    void eat(){
        System.out.println("Eating Anything");
    }
    abstract void walk();
}

class Lion extends  Animal_1{
    void walk(){

        System.out.println("Walking in 4 lags");
    }
}

class Duck extends Animal_1{
    void walk(){

        System.out.println("Walking in 2 legs");
    }
}

public class OOPS_Abstract {

    public static void main(String[] args) {
       Lion l = new Lion();
       l.eat();
       l.walk();
       Duck d = new Duck();
       d.walk();

    }
}
