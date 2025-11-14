package ClassPractice.MainTopic.LinkedList.Search.RecursiveApproach;

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
        Node head = new Node(12);
        Node p1= new Node(34);
        Node p2 = new Node(98);
        Node p3 = new Node(56);
        head.next = p1;
        p1.next = p2;  //head.next.next = p2
        p2.next = p3; //head.next.next.next = p3
        System.out.println("Enter the search element : ");
        int searchKey = sc.nextInt();
        if(search(head,searchKey)==-1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at "+search(head,searchKey)+" node");
        }
    }
    public static int search(Node head,int key)
    {
        if(head == null){
            return -1;
        }
        if(head.data == key)
        {
            return 1;
        }
        int pos = search(head.next,key);
        if(pos==-1)
        {
            return -1;
        }
        return pos+1;
    }
}
