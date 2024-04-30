package OOPSinJAVA;

public class ClassConstructor {
    public static void main(String[] args) {

        System.out.println(Employee.NumberOfEmployees);

        Employee emp1 = new Employee("Ram",101,120000);
        System.out.println(emp1.NumberOfEmployees); // 1
        Employee emp2 = new Employee("kalvin",102,100000);
        System.out.println(emp2.NumberOfEmployees); // 2
        Employee emp3 = new Employee("Radha",103,45000);
        System.out.println(emp3.NumberOfEmployees); // 3

//        System.out.println(emp1.NumberOfEmployees); // 3
//        System.out.println(emp2.NumberOfEmployees); // 3
//        System.out.println(emp2.NumberOfEmployees); // 3
//        System.out.println("Without parameter constructor :");
//        emp1.emp_name = "John";
//        emp1.Id = 101;
//        emp1.salary = 15000;
//      //  emp1.schoolName = "Rkgit";   cannot assign value to final variable 'schoolName'
//        System.out.println(emp1.emp_name);
//        System.out.println(emp1.Id);
//        System.out.println(emp1.salary);


//
//       // emp2.emp_name = "Bond James";
//        System.out.println("with Parameter constructor :");
//        System.out.println(emp2.emp_name);
//        System.out.println(emp2.Id);
//        System.out.println(emp2.salary);
//
    }
}
