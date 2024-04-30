package StringinJAVA;

import java.util.Scanner;

public class reverseWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        String ans = "";
        StringBuilder sb = new StringBuilder(""); // Create empty string

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);

            }else {
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder(); // delete char and create empty string
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);

    }
}
