package StringinJAVA;
import java.util.*;
public class StringsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take string input
       // String str = sc.next();
        // String str = sc.nextLine();
       // System.out.println(str);
        String  name = "dbc";
       // char ch = name.charAt(0);
       // System.out.println(ch);
       // System.out.println(name.indexOf("s")); // 0


//        // in-build method of string
        // tolowerCase method
//        System.out.println(name.toLowerCase());
        // toUpperCase method
//        System.out.println(name.toUpperCase());
         String surname = "abc";
        // concat method
        // name.concat(surname); useless
        //System.out.println(name.concat(surname));
        // Contains method
       // System.out.println(name.contains("nkar"));
        // Startwith method
        // System.out.println(name.startsWith("sha"));
        // endwith method
        // System.out.println(name.endsWith("kar"));
        // compareTo method

        // str == gtr // 0
        // str>gtr // >0
        //str<gtr // <0
        System.out.println(name.compareTo(surname));


    }
}
