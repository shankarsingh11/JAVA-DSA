package OOPSinJAVA;

public class Main {
    public static void main(String[] args) {
        Human Ramesh = new Human(20,"Ramesh",15000,true);

        Human shyam = new Human(20,"Shyam",10000,false);
        System.out.println(Human.population);
        System.out.println(Ramesh.getName());
        System.out.println(shyam.getSalary());
        shyam.setSalary(20000);
        System.out.println(shyam.getSalary());


    }
}
