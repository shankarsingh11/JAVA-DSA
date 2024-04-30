package LinkedListJAVA;
import java.util.*;
public class Basicsll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node a = new Node(3);
        Node b = new Node(6);
        Node c = new Node(9);
        Node d = new Node(7);
        Node e = new Node(5);
        // 3 6 9 7 5
        a.next = b; // 3 -> 6 9 7 5
        b.next = c;// 3 -> 6 -> 9 7 5
        c.next = d;// 3 -> 6-> 9-> 7 5
        d.next = e;// 3 -> 6 ->9 ->7-> 5

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
        System.out.println("Node Value :");

        System.out.println(a.data);// 3
        System.out.println(a.next.data);// 6
        System.out.println(a.next.next.data);// 9
        System.out.println(a.next.next.next.data); // 7
        System.out.println(a.next.next.next.next.data);// 5



    }
}
