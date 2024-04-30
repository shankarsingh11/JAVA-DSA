package LinkedListJAVA;

public class Displayll {

    public  static  void display(Node haed){
        Node temp = haed;
        while (haed!=null){
            System.out.print(haed.data+" "); // 2 3 4 5 6
            haed = haed.next;
        }
     // No anything print bcs head == null  makes in first while loop

        while (haed!=null){
            System.out.print(haed.data+" ");
            haed = haed.next;
        }
    }


    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b  = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e  = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

      //  Node temp = a;  // temp point a first or head node

//        for (int i = 0; i < 5; i++) {
//            System.out.print(temp.data+ " ");
//            temp = temp.next;
//        }
         display(a);
    }
}
