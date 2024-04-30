package OOPSinJAVA.Inheritance;

public class Box {
     double l;
     double w;
     double h;

  static  void greeting(){
      System.out.println("Hey , I am in Box class, greetings ");
  }

    public Box() {
        System.out.println(" Box class Constructor");
        this.l = -1;
        this.w = -1;
        this.h = -1;

    }

    // cube

    public Box(double side) {

        this.l = side;
        this.h = side;
        this.w = side;
    }

    public Box(double side, double w) {
        this.l = side;
        this.w = w;
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public Box(Box box2) {
         this.l = box2.l;
         this.w = box2.w;
         this.h = box2.h;

    }

}
