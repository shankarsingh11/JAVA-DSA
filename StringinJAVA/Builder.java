package StringinJAVA;

import java.util.Scanner;

public class Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take Input
       // StringBuilder str = new StringBuilder(sc.nextLine());
        // StringBuilder str = new StringBuilder(sc.next());
        StringBuilder str = new StringBuilder("Hello");
        //str.append("world");
        str.setCharAt(0,'m');
       // str.append(true);
        str.append(" World");
        System.out.println(str);
    }
}
