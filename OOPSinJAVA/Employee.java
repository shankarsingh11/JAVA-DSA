package OOPSinJAVA;

public class Employee {
    String emp_name;
    int Id;
    double salary;

    final  String schoolName = "Rdec";
    // int NumberOfEmployees;
    static  int NumberOfEmployees;

    // constructor without parameter
    public Employee(){ // Default constructor

    }

    // constructor with parameter
//    public Employee(String name,int emp_id,double stipend){
//        emp_name = name;
//        Id = emp_id;
//        salary = stipend;
//    }

        // Using a "this" Keyword use same name in parameter
        public Employee(String emp_name,int Id,double salary){
        this.emp_name = emp_name;
        this.Id = Id;
        this.salary = salary;
        NumberOfEmployees++;
    }


    public  int getId(){  // getter
        return Id;
    }

    public  void setEmp_name(String emp_name){ // setter
        this.emp_name = emp_name;
    }


}
