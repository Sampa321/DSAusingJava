import java.util.Scanner;

public class Node {
    int data;
    Node next;
    public Node(int value)
    {
        this.data = value;
        this.next = null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(23);
        Node p1 = new Node(787);
        Node p2 = new Node(56);
        Node p3 = new Node(66);
        head.next = p1;
        p1.next = p2;
        p2.next = p3; 
        deleteLastNode(head);
        Node current= head;
        while(current!=null){
            System.out.print(current.data+" ");
            current= current.next;
        }
    } 
    public static void deleteLastNode(Node head){
        if(head == null){
            return;
        }
        Node current=head;
        if(head.next == null){
            head = null;
            return ;
        }while(current.next.next!=null){
            current= current.next;
        }
        current.next = null;
    }
}