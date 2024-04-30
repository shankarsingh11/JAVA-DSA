package OOPSinJAVA;

public class InnerClass {

    public static   class Test{
       String name;

        public  Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return  name;
        }
    }
    public static void main(String[] args) {

        Test obj1 = new Test("shankar");
        Test obj2 = new Test("ramesh");

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
}
