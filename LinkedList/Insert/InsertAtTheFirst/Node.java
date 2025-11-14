package ClassPractice.MainTopic.LinkedList.Insert.InsertAtTheBegining;

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
        System.out.println("Enter the data which data you can add : ");
        int key = sc.nextInt();
        head = insertAtFirst(head,key);
        if(head == null)
        {
            System.out.println("List is empty!");
            return;
        }
        Node curr=head;
        while (curr!=null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    public static Node insertAtFirst(Node head,int key){
            Node temp = new Node(key);
            temp.next = head;
            return temp;
    }
}
