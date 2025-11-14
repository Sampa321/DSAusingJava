package ClassPractice.MainTopic.LinkedList.Insert.InsertAtTheEnd;

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
        Node head = new Node(10);
        Node p1 = new Node(20);
        Node p2 = new Node(30);
        Node p3 = new Node(40);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the add element : ");
        int key = sc.nextInt();
        head = InsertAtEnd(head,key);
        Node curr = head;
        while (curr!=null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    public static Node InsertAtEnd(Node head,int key)
    {
        Node temp = new Node(key);
        if (head == null)
        {
            return temp;
        }
        Node curr = head;
        while (curr.next!=null)
        {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
}
