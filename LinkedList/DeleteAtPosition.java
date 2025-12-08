package ClassPractice.MainTopic.LinkedList.Delete;

import java.util.Scanner;

public class DeleteAtPosition {
    int data;
    DeleteAtPosition next;
    public DeleteAtPosition(int value)
    {
        this.data = value;
        this.next = null;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        DeleteAtPosition head = new DeleteAtPosition(10);
        DeleteAtPosition p1 = new DeleteAtPosition(20);
        DeleteAtPosition p2 = new DeleteAtPosition(40);
        DeleteAtPosition p3 = new DeleteAtPosition(50);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        System.out.println("Enter position you want to delete element : ");
        int pos = sc.nextInt();
        head = DeleteAtPos(pos,head);
        DeleteAtPosition curr = head;
        while (curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    public static DeleteAtPosition DeleteAtPos(int pos,DeleteAtPosition head)
    {
        DeleteAtPosition curr = head;
         if(head==null)
         {
             System.out.println("Linked list is empty");
             return head;
         }
         if(head.next == null && pos == 1)
         {
             return null;
         }

         if(pos == 1)
         {
             return head.next;
         }
         for(int i=1;i<pos-1;i++)
         {
             if(curr.next == null)
             {
                 System.out.println("Invalid Position");
                 return head;
             }
             curr = curr.next;
         }
         curr.next = curr.next.next;
         return head;
    }
}
