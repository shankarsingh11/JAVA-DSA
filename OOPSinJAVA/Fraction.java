package OOPSinJAVA;

public class Fraction {

    public static refraction add(refraction f1, refraction f2){
        int numerator = f1.num*f2.den + f1.den*f2.num;
        int denominator = f1.den * f2.den;
        refraction f3 = new refraction(numerator,denominator);
        return f3;
    }

    public static refraction multiply(refraction f1, refraction f2){
        int numerator = f1.num* f2.num ;
        int denominator = f1.den * f2.den;
        refraction f3 = new refraction(numerator,denominator);
        return f3;
    }
    public static refraction subtraction(refraction f1, refraction f2){
        int numerator = (f1.num* f2.den) - (f2.num*f1.den );
        int denominator = f1.den * f2.den;
        refraction f3 = new refraction(numerator,denominator);
        return f3;
    }

    public  static  int gcd(int num,int den){
         int min = Math.min(num,den);
        for (int i = min; i >=1; i--) {
            if(num%i==0 && den%i==0) return i;
        }
        return  min;
    }
    public  static  class refraction {
        int num;
        int den;

        public refraction(int num , int den){
            this.num = num;
            this.den = den;
            simplify();
        }
       public void simplify(){
      int hcf = gcd(num,den);
       num /= hcf;
       den /= hcf;
       }


    }
    public static void main(String[] args) {
        refraction f1 = new refraction(35,21);
        System.out.println(f1.num+"/"+f1.den);
        refraction f2 = new refraction(7,3);
        System.out.println(f2.num+"/"+f2.den);
        refraction f3 = add(f1,f2);
        System.out.println(f3.num+"/"+f3.den);
//        refraction f4 = multiply(f1,f2);
//        System.out.println(f4.num+"/"+f4.den);
//        refraction f5 = subtraction(f1,f2);
//        System.out.println(f5.num+"/"+f5.den);


       // f1.simplify();
       // System.out.println(f1.num+"/"+f1.den);

//        refraction f2 = new refraction(7,3);
//        System.out.println(f2.num+"/"+f2.den);
    }
}
