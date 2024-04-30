package StringinJAVA;

import java.util.Scanner;

public class Togglestring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
        System.out.println(str);
        for (int i = 0; i <str.length() ; i++) {
            // check alphabet -> small , Capital
            boolean flag = true; // capital A
            char ch = str.charAt(i);
            if (ch == ' ')continue; // skip space
            int asci = (int) ch;
            if (asci>=90) flag = false; // small a
            if (flag == true){
                asci += 32;
                char a = (char) asci;
                str = str.substring(0,i) + a + str.substring(i+1);
            }else {
                      asci -= 32;
                      char a = (char)asci;
                      // shnkar -> sha + N + kar
                str = str.substring(0,i) + a + str.substring(i+1);
            }
        }

        System.out.println(str);

        
    }
}
