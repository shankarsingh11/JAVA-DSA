package OOPSinJAVA;

class Pen{
    String color = "red";
    int Tip = 5;
     void setColor(String newColor){
         color = newColor;
     }
     void  setTip(int newTip){
         Tip = newTip;
     }

}

class Worker{
    String name ;
    int id ;
    int age;
}

class BankAccount{
    public  String  username;
    private String password ;
    public  void setPassword(String pwd){
        password = pwd;
    }

}


public class OOPS {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Shankar Singh";
        myAcc.setPassword("abhdkshdhk");
        System.out.println(myAcc.username);


//        Pen p1 = new Pen(); // created a Pen object by p1
//        Worker w1 = new Worker(); // created a Worker object by w1
//        System.out.println(p1.color);
//        p1.setColor("blue");
//        System.out.println(p1.color);
//        p1.setTip(4);
//        System.out.println(p1.Tip);
//        w1.name = "Abhinash";
//        System.out.println(w1.name);
    }
}
