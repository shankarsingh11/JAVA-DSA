package LinkedListJAVA;

public class DisplayRecursivily{

    public static void displayrecursively(Node head){

        // base condition;
         if (head ==null)return;

         System.out.println(head.data);// 10 20 30 40 50
         // recursively call
         displayrecursively(head.next);
         //System.out.println(head.data);// 50 40 30 20 10
    }

    public  static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }

    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        a.data = 10;
//        a.next.data = 20;
//        a.next.next.data = 30;
//        a.next.next.next.data = 40;
//        a.next.next.next.next.data= 50;

//        System.out.println(a.data);
//        System.out.println(b.data);
//        System.out.println(c.data);
//        System.out.println(d.data);
//        System.out.println(e.data);
          displayrecursively(a);


    }
}
