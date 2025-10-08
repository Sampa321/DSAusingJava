package ClassPractice.SortingAlgorithm.MergeSortSolution;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 1st array size : ");
        int n=sc.nextInt();
        int []a1 =new int[n];
        System.out.println("Enter the 1st array element:");
        for(int i=0;i<n;i++)
        {
            System.out.print("a1["+i+"]=");
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter the 2nd array size : ");
        int m=sc.nextInt();
        int []a2 =new int[m];
        System.out.println("Enter the 2nd array element:");
        for(int i=0;i<m;i++)
        {
            System.out.print("a2["+i+"]=");
            a2[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(Merge(a1,a2)));
        sc.close();
    }
    public static int[] Merge(int []a1,int []a2)
    {
        int i=0;
        int j=0;
        int index=0;
        int[] temp =new int[a1.length+a2.length];
        while(i<a1.length && j<a2.length)
        {
            if(a1[i]<=a2[j])
            {
                temp[index++]=a1[i++];
            }
            else {
                temp[index++] = a2[j++];
            }
        }
        while(i<a1.length)
        {
            temp[index] = a1[i++];
            index++;
        }
        while(j<a2.length)
        {
            temp[index] = a2[j++];
            index++;
        }
        return temp;
    }
}
