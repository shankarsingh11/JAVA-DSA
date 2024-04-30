package OOPSinJAVA.Inheritance;

public class Main {

    public static void main(String[] args) {
       // Box box1 = new Box();
       // Box box2 = new Box(3.9,4.5,3);
       // Box box3 = new BoxWeight();
        //Box box4 = new BoxWeight(9.2,3.5,5,10);
        // BoxWeight box5 = new BoxWeight(2.1,1.2,4.1,13);
       // Box box = new Box(box2);

        Box b = new Box();
        // never ref parent class to child class , so here  given a error
      //   BoxWeight b = new Box();
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);
//        System.out.println(box5.l + " " + box5.w + " " + box5.h + " " + box5.weight);
        b.greeting();

    }
}
