package OOPSinJAVA.ExceptionHandling;

public class Demo_Error2 {
     void  printNumber() throws InterruptedException {
         for (int i = 0; i <500; i++) {
             System.out.println(i);
             Thread.sleep(200);
         }
     }

}
