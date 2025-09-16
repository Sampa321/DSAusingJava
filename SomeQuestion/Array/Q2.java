package Arrays;

/*Problem Statement: Given an array, find the second smallest and second largest element in the array.
Print ‘-1’ in the event that either of them doesn’t exist.
Example1:
Input:[1,2,4,7,7,5]
Output:Second Smallest:2
       Second Largest:5
Example2:
Input:[1]
Output:Second Smallest:-1
       Second Largest:-1
Example3:
Input:[3,3,3]
Output:Second largest:-1
       Second smallest:-1
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n=sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sec_min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>sec_max && arr[i]<max)
            {
                sec_max = arr[i];
            }
            if(arr[i]>min && arr[i]<sec_min)
            {
                sec_min = arr[i];
            }
        }
        if(sec_max==Integer.MIN_VALUE)
        {
            sec_max = -1;
        }
        if(sec_min==Integer.MAX_VALUE)
        {
            sec_min = -1;
        }
        System.out.println("Second maximum element: "+sec_max);
        System.out.println("Second minimum element: "+sec_min);
    }

}
