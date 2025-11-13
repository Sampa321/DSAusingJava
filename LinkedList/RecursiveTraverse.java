package ClassPractice.MainTopic.LinkedList.Traversal;

public class RecursiveTraverse {
    int data;
    IterativeTraverse next;
    RecursiveTraverse(int value)
    {
        this.data = value;
        this.next = null;
    }
    public static void main(String[] args) {
       /* IterativeTraverse head = new IterativeTraverse(10);
        IterativeTraverse p1 = new IterativeTraverse(20);
        IterativeTraverse p2= new IterativeTraverse(30);
        IterativeTraverse p3 = new IterativeTraverse(40);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;*/
        //IterativeTraverse head = new IterativeTraverse(10);
        IterativeTraverse head = null;
        traverse(head);
    }
    public static void traverse(IterativeTraverse head)
    {
        if(head ==null)
        {
            System.out.println("Linked list is empty!");
            return;
        }
        System.out.println(head.data);
        traverse(head.next);
    }
}
