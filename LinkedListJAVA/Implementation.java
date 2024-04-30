package LinkedListJAVA;

public class Implementation{
// Create a Node class
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    // create linked list class
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;

      // insertAtEnding method
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head==null){
                head = temp;
            }else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        // Print the linked list element
        void  display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }

        }

        // // InsertAtBeginning method
        void insertAthead(int val){
         Node temp = new Node(val);
         if (head == null){ // empty list
             head = tail = temp;
         }else { // non-empty list
              temp.next = head;
              head=temp;
           }
         size++;
        }

        // GetElement Method
        int getAt(int idx){
            if (idx <0 || idx>size) {
                System.out.println("Wrong Index");
                return -1;
            }
            Node temp = head;
            for (int i = 0; i <idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // InsertAt Method
        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if (idx == size) {
                insertAtEnd(val);
                return;
            }else if (idx == 0){
                insertAthead(val);
                return;
            } else if (idx<0 || idx>size) {
                System.out.println("wrong index!");
                return;
            }
            for (int i = 0; i < idx-1; i++) {
                temp=temp.next;
            }
            t.next  = temp.next;
            temp.next = t;
            size++;
        }

    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAthead(12);
        ll.insertAtEnd(10);
        ll.insertAthead(15);
        ll.insertAt(2,20);
        ll.insertAt(6,30);
        ll.insertAt(0,9);
        ll.display();
        System.out.println();
        System.out.println(ll.getAt(4));
        System.out.println(ll.size);


    }
}
