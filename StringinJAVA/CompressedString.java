package StringinJAVA;

import java.util.Scanner;

public class CompressedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "aaabbbbcdddeee";
        System.out.println(str);
        String ans = "";
         ans += str.charAt(0); // ans -> a
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if (prev == curr) {
                count++;
            }else {
                 if (count>1) ans += count;
                count = 1;
                ans += curr;
            }
        }
        if (count>1) ans += count;
        System.out.println(ans);

    }
}
