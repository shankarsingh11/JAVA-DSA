package OOPSinJAVA.Polymorphism;


// Types Of Polymorphism -> Compile time/ Static Polymorphism and

 //                        Runtime / Dynamic polymorphism
public class Main {

    public static void main(String[] args) {
        Number num = new Number();
      int rs =   num.sum(10,20);
        num.sum(10,20,30);
        num.sum(10,20,30,40);

        System.out.println("Sum is : "+rs);


    }
}
