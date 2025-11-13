package ClassPractice.MainTopic.LinkedList.Traversal;

import java.util.Scanner;

public class SearchIterativeApproach {
    int data;
    SearchIterativeApproach next;
    SearchIterativeApproach(int value)
    {
        this.data = value;
        this.next = null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchIterativeApproach head = new SearchIterativeApproach(10);
        SearchIterativeApproach p1 = new SearchIterativeApproach(20);
        SearchIterativeApproach p2 = new SearchIterativeApproach(30);
        SearchIterativeApproach p3 = new SearchIterativeApproach(40);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        System.out.println("Enter the search element : ");
        int ele=sc.nextInt();
        search(head,ele);
    }
    public static void search(SearchIterativeApproach head,int search){
        int c=1;
        if(head == null)
        {
            System.out.println("Search element not found");
            return;
        }
        SearchIterativeApproach current = head;
        while (current!=null)
        {
            if(current.data == search)
            {
                System.out.println(search+" found at "+c+" node");
                return;
            }
            c++;
            current = current.next;
        }
        System.out.println("Search element not found");
    }
}
