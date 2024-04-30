package OOPSinJAVA;

// Super Keyword

class  Animal_2{
    String color;
    Animal_2(){
        System.out.println("Animal_2 constructor is called");
    }
}

class Horse extends  Animal_2{
    Horse(){
       super.color = "Brown";
        System.out.println("Horse Constructor is called");
    }
}
public class OOPS_SuperKeyword{
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}
