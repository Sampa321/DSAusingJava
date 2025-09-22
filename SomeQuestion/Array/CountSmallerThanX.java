package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;

/*
Given an unsorted array arr[] of size N containing non-negative integers. You will also be given an integer X, the task is to count the number of elements which are strictly smaller than X. The given integer may or not be present in the array given.

Example 1:

Input:
N = 5
arr[] = {4 5 3 1 2}
X = 3
Output: 2
Explanation: Here X = 3, and elements that are smaller than X are 1 and 2.
Example 2:

Input:
N = 6
arr[] = {2 2 2 2 2 2}
X = 3
Output: 6
Explanation: Here X = 3, and elements that are smaller than X are 2 2 2 2 2 2.
Your Task:
 */
public class CountSmallerThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int []arr = new int[n];
        for(int i=0;i< arr.length;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the check element:");
        int x=sc.nextInt();
        int r = smallerThanX(arr,n,x);
        System.out.println("Count no of less then x : "+r);
    }
    public static int smallerThanX(int arr[], int n, int x) {
        // Your code here
        int c=0;
        for(int ele:arr)
        {
            if(ele<x)
            {
                c++;
            }
        }
        return c;
    }
}
