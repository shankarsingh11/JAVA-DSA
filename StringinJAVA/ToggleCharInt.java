package StringinJAVA;

import java.util.Scanner;

public class ToggleCharInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        System.out.println(s);
        // toggle only character, not other symbol or value
        // P -> p
        for (int i = 0; i < s.length(); i++) {
            // check  Alphabet -> small , Capital

            boolean flag = true; // true -> Capital A
            char ch = s.charAt(i);
            if (ch == ' ') continue;
            int asci = (int) ch;
            if (asci >= 0 && asci <= 64) continue;
            if (asci >= 97) flag = false;
            if (flag == true) {
                asci += 32;
                char a = (char) asci;
                s.setCharAt(i,a);
            }else {
                asci -= 32;
                char a = (char) asci;
                s.setCharAt(i,a);
            }
        }
        System.out.println(s);
    }
}
