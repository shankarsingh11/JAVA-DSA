package OOPSinJAVA;

// Hierarchical Inheritance

class Animals{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void  breathe(){
        System.out.println("Breathing");
    }

}

class Mammals extends Animals{
    void walks(){
        System.out.println("Walks");
    }
}

class Fishs extends  Animals{
    void  swim(){
        System.out.println("swim");
    }
}

class  Birds extends Animals{
    void fly(){
        System.out.println("Fly");
    }
}

public class OOPS6 {
    public static void main(String[] args) {
    Birds b = new Birds();
    Fishs f = new Fishs();
    Mammals m = new Mammals();
    m.breathe();
    }
}
