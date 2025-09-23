package HomePractice.GeeksForGeeks.Arrays;

import java.util.HashSet;
import java.util.Scanner;

/*
Given a sorted array arr[]. Count the number of distinct absolute values present in the array.

Examples:

Input: arr[] = [-3, -2, 0, 3, 4, 5]
Output: 5
Explanation: There are 5 distinct absolute values i.e. 0, 2, 3, 4 and 5.
Input: arr[] = [-1, -1, -1, -1, 0, 1, 1, 1, 1]
Output: 2
Explanation: There are 2 distinct absolute values among the elements of this array, i.e. 0 and 1.

 */
public class DistinctAbsoluteArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n= sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        int r = distinctCount(arr);
        System.out.println("Result is : "+r);
    }
    public static int distinctCount(int[] arr) {
        // Your code goes here.
        HashSet<Integer> set = new HashSet<Integer>();
        for(int ele:arr)
        {
            set.add(Math.abs(ele));

        }
        int r=set.size();
        return r;
    }
}
