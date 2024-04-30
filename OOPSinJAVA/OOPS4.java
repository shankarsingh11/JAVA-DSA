package OOPSinJAVA;


class  Faculty{
    String name;
    int id;
    int salary[];

//  shallow Copy Constructor
//    Faculty(Faculty f1){
//        salary = new int [3];
//        this.name =  f1.name;
//        this.id = f1.id;
//        this.salary = f1.salary;
//    }

    // Deep Copy Constructor
     Faculty(Faculty f1){
         salary = new int[3];
         this.name = f1.name;
         this.id = f1.id;
         for (int i = 0; i < salary.length; i++) {
             this.salary[i] = f1.salary[i];
         }
     }

    Faculty(){
        salary = new int[3];
       // System.out.println("Constructor is called ... ");
    }

    Faculty( int id){
        this.id = id;
        salary = new int[3];
    }
    Faculty(String name){
        this.name = name;
        salary = new int[3];
    }
}
public class OOPS4 {
    public static void main(String[] args) {
        Faculty f1 = new Faculty();
        f1.name = "Shankar Singh";
        f1.id = 112;
        f1.salary[0] =100;
        f1.salary[1] = 90;
        f1.salary[2] = 80;
        Faculty f2 = new Faculty(f1);
         f2.name = "Dheeraj Singh";
         f2.salary[2] = 100;
        System.out.println(f1.name);

        for (int i = 0; i < 3; i++) {
            System.out.println(f1.salary[i]);
        }

    }
}
