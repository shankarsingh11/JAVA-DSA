package OOPSinJAVA;

// Method Overloading // Compile time polymorphism

class Calculator{
    int sum(int a , int b){
        return  a + b;
    }
    float sum(float a, float b){
        return  a + b;
    }

    int sum(int a,int b, int c){
        return  a + b + c;
    }

}
public class OOPS7 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float) 1.5,(float) 2.5));
        System.out.println(calc.sum(2,3,4));
    }
}
