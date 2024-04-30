package OOPSinJAVA;

// Static Keyword

class Students{
    String name;
    int id;
    static String sname;
    public void setName(String name,int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
}

public class OOPS_StaticKeyword {
    public static void main(String[] args) {

        Students s1 = new Students();
        Students s2 = new Students();
        s1.sname = "DPS";
        System.out.println(s2.sname);


    }
}
