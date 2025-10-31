package ClassPractice.SortingAlgorithm.HeapSort;

import java.util.Scanner;

public class Formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the node at index : ");
        int i=sc.nextInt();
        System.out.println("Parent of index "+i+" is : "+parent(i));
        System.out.println("Left child of index "+i+" is : "+leftChild(i));
        System.out.println("Right child of index "+i+" is : "+rightChild(i));
    }
    public static int parent(int i)
    {
        return (i-1)/2;
    }
    public static int leftChild(int i)
    {
        return (2*i+1);
    }
    public static int rightChild(int i)
    {
        return (2*i+2);
    }
}
