package OOPSinJAVA;

class Engineer{
    String engName ;
    int Id;

    // Types Of Constructor

    // Non-Parameterized constructor
    Engineer(){
        System.out.println("Constructor is called ...");
    }

    // parameterized Constructor
    Engineer(String engName){
        this.engName = engName;
    }


    Engineer(int Id){
        this.Id = Id;
    }

    Engineer(String engName,int Id){
        this.engName = engName;
        this.Id = Id;
    }
}
public class OOPS3 {

    public static void main(String[] args) {
        Engineer eng1 = new Engineer();
        Engineer eng2 = new Engineer("Shankar");
        Engineer eng3 = new Engineer(110);
        Engineer eng4 = new Engineer("Vipul", 111);

        System.out.println(eng1.engName);
        System.out.println(eng1.Id);
    }
}
