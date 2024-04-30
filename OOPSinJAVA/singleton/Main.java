package OOPSinJAVA.singleton;

public class Main {
    public static void main(String[] args) {

        // all 3 ref variables are pointing to just one object
        Singleton obj1 = Singleton.getinstance();
        Singleton obj2 = Singleton.getinstance();
        Singleton obj3 = Singleton.getinstance();


    }
}
