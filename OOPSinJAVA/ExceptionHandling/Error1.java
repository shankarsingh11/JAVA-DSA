package OOPSinJAVA.ExceptionHandling;

public class Error1 {
       void  show(){
           int a = 8;
           int b = 0;
             try {
                 int result = a/b;
                 System.out.println(result);
             }catch (ArithmeticException e){
                 System.out.println(e.getMessage());
             }


       }
}
