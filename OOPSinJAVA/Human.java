package OOPSinJAVA;

public class Human {
    private  int age;
    private String name;
    private  int salary;
    private boolean married;

    static  long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.population += 1;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public boolean isMarried() {
        return married;
    }

    void  message(){
        System.out.println("Hello World");
        greeting();
    }

   static  void  greeting(){
        System.out.println("Hii :");
       //  message();  non static method,  need of object
    }
}
