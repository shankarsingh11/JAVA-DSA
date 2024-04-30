package StringinJAVA;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcdcba";
        int i = 0;
        int j = str.length()-1;
        boolean flag = true;// true -> palindrome
        while (i<j){
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if (flag) System.out.println("Palindrome"); // (flag == true)
        else System.out.println("Not Palindrome");
    }
}
