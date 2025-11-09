package HomePractice.GeeksForGeeks.Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

/*
You are given an array of size N. Rearrange the given array in-place such that all the negative numbers occur before all non-negative numbers.
(Maintain the order of all -ve and non-negative numbers as given in the original array).

Example 1:
Input:
N = 4
Arr[] = {-3, 3, -2, 2}
Output:
-3 -2 3 2
Explanation:
In the given array, negative numbers
are -3, -2 and non-negative numbers are 3, 2.
Example 2:
Input:
N = 4
Arr[] = {-3, 1, 0, -2}
Output:
-3 -2 1 0
Explanation:
In the given array, negative numbers
are -3, -2 and non-negative numbers are 1, 0.
 */
public class ArrangingTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }
        Rearrange(arr,n);
    }
    public static void Rearrange(int a[], int n) {
        // Your code goes here
        int []re=new int[a.length];
        int index=0;
        for(int ele:a)
        {
            if(ele<0)
            {
                re[index++]=ele;
            }
        }
        for(int ele:a)
        {
            if(ele>=0)
            {
                re[index++]=ele;
            }
        }
        int idx=0;
        for(int ele:re)
        {
            a[idx++]=ele;
        }
        System.out.println("After arranging array,your array is : "+ Arrays.toString(re));
    }
}
