package OOPSinJAVA.Inheritance;

public class BoxWeight extends Box {
         double weight;

         public  BoxWeight(){
              super();
             System.out.println("This is BoxWeight constructor");
         }

         // static method can not override
    
//  @Override
    static  void greeting(){
        System.out.println("Hey , I am in Box class, greetings ");
    }
    public BoxWeight(int weight) {

             this.weight = weight;
    }

    public  BoxWeight(Box other,double weight){
             super(other);
             this.weight = weight;
    }


    public BoxWeight(double l, double w, double h, int weight) {
        super(l, w, h);
        this.weight = weight;
    }


}
