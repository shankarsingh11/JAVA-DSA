package OOPSinJAVA;

public class Student {
     public String name;
     private  int rno;
     double percent;
     public  int getRno(){ // getter
         return rno;
     }

//     public  void setRno(int Roll){  // setter
//       rno = Roll;
//     }


     // 'this' keyword
     public  void setRno(int rno){  // setter
         this.rno = rno;
     }

}
