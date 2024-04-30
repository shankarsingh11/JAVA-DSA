package OOPSinJAVA.singleton;

public class Singleton {
    // private constructor
     private  Singleton(){

     }

     public  static  Singleton instance;
     public  static  Singleton  getinstance(){
          // check whether 1 obj is created or not
         if (instance == null){
             instance = new Singleton();
         }
         return  instance;
     }
}
