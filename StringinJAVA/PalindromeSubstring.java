package StringinJAVA;
import java.util.*;
public class PalindromeSubstring {

    public static  boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        boolean flag = true; // true -> palindrome
        while (i<j){
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str = "abcba"; // sunstring -> a, ab,abc,b,bc,c  // palindrome substring -> a,b,c
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <= str.length(); j++) {

               if (isPalindrome(str.substring(i,j)) == true){
                   System.out.print(str.substring(i,j)+ " ");
                   count++;
               }
            }
        }
        System.out.println("the number of palindrome substrings are :"+count);
    }
}
