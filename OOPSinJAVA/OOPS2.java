package OOPSinJAVA;


class Bank{
    private int AccNo;
    public String  AccHolder;
    private  String password ;
    public int getAccNo(){
        return  this.AccNo;
    }

    public  String getPassword(){ // Getter
        return this.password;
    }
    public  String getAccHolder(){
        return this.AccHolder;

    }

    public  void setpassword(String password){ // Setter
          this.password = password;  // this keyword refered to current object value or property
    }

    public  void setAccHolder(String AccHolder){
        this.AccHolder = AccHolder;
    }

    public  void setAccNo(int AccNo){
        this.AccNo = AccNo;
    }

}
public class OOPS2 {
    public static void main(String[] args) {
        Bank myAcc = new Bank();
        myAcc.setpassword("hsusdhydjl");
        myAcc.setAccHolder("Shankar Singh");
        myAcc.setAccNo(12345678);
        System.out.println(myAcc.getAccHolder());
        System.out.println(myAcc.getAccNo());
        System.out.println(myAcc.getPassword());



    }
}
