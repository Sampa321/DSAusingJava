package ClassPractice.MainTopic.LinkedList.Insert;

import java.util.Scanner;

public class InsertAtPosition {
    int value;
    InsertAtPosition next;
    public InsertAtPosition(int value){
        this.value = value;
        this.next = null;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        InsertAtPosition head = new InsertAtPosition(10);
        InsertAtPosition p1 = new InsertAtPosition(20);
        InsertAtPosition p2 = new InsertAtPosition(30);
        head.next = p1;
        p1.next = p2;

        System.out.print("Enter the new Linked list element : ");
        int ele = sc.nextInt();
        System.out.print("Enter the position you add element :");
        int pos = sc.nextInt();
        head = insertAtPos(pos,ele,head);

        InsertAtPosition curr = head;
        while(curr!=null)
        {
            System.out.print(curr.value+" ");
            curr = curr.next;
        }
    }
    public static InsertAtPosition insertAtPos(int pos,int ele,InsertAtPosition head){
        InsertAtPosition temp= new InsertAtPosition(ele);
        InsertAtPosition curr = head;
        for(int i=1;i<pos-1 && curr!=null ;i++)
        {
            curr = curr.next;
        }
        if(curr == null)
        {
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}
