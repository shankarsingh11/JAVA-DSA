package StringinJAVA;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle
        // ShaNkAR -> sHAnKar
        for (int i = 0; i < str.length(); i++) {

            // check -> alphabet -> small, capital

            boolean flag = true; // true -> Capital
            char ch = str.charAt(i); // A
            if( ch == ' ') continue;
            int asci = (int) ch; // 65
            if (asci>=97) flag = false; // small
            if(flag == true){
                asci += 32;
                char a = (char) asci;
                str.setCharAt(i,a);
            }
            else {
                asci -= 32;
                char a = (char) asci;
                str.setCharAt(i,a);
            }

        }
        System.out.println(str);
    }
}
