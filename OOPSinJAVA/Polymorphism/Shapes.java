package OOPSinJAVA.Polymorphism;

public class Shapes {


    void  area(){
        System.out.println("I am a shapes ");
    }


//Early bindind check notes
//  final   void  area(){
//
//        System.out.println("I am a shapes ");
//    }

    public static void main(String[] args) {

        Shapes shapes = new Shapes();
         Triangle triangle = new Triangle();
        Shapes triangle1 = new Triangle();
         Circle circle = new Circle();
         Square square = new Square();
        Shapes circle1 = new Circle();
        Shapes square1 = new Square();

        shapes.area();
//        circle1.area();
        square.area();
        circle.area();
        triangle.area();
        //square1.area();
    }
}
