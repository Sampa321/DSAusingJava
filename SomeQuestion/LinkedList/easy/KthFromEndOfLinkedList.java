package HomePractice.GeeksForGeeks.LinkedList.Easy;

import java.util.Scanner;

public class KthFromEndOfLinkedList {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);
        System.out.print("Enter the position from end node :");
        int pos = sc.nextInt();
        System.out.println("This position node is : "+getKthFromLast(head,pos));
    }
    public static int getKthFromLast(Node head, int k) {
        // Your code here
        Node curr = head;
        int c=0;
        while(curr!=null)
        {
            c++;
            curr = curr.next;
        }

        if(k>c)
        {
            return -1;
        }
        int pos=c-k;
        curr = head;
        for(int i=1;i<=pos;i++)
        {
            curr=curr.next;
        }
        return curr.data;
    }
}
