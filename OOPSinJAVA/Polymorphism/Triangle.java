package OOPSinJAVA.Polymorphism;

public class Triangle extends Shapes {

    @Override
    void area() {
        super.area();
        System.out.println("Area is L * h * b");
    }
}
