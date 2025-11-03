package HomePractice.GeeksForGeeks.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
You are given a binary array arr[], where each element is either 0 or 1. Your task is to rearrange the array in increasing order in place (without using extra space). You do not need to return anything; simply modify the input array.
Examples:

Input: arr[] = [1, 0, 1, 1, 0]
Output: [0, 0, 1, 1, 1]
Explanation: After arranging the elements in increasing order, elements will be as 0 0 1 1 1.
Input: arr[] = [1, 0, 1, 1, 1, 1, 1, 0, 0, 0]
Output: [0, 0, 0, 0, 1, 1, 1, 1, 1, 1]
Explanation: After arranging the elements in increasing order, elements will be 0 0 0 0 1 1 1 1 1 1.
Input: arr[] = [1, 1, 1, 1]
Output: [1, 1, 1, 1]
Explanation: Since the array already contains only 1s, no change is needed.

 */
public class BinaryArraySorting {
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
        binSort(arr);
        System.out.println("After binary array sorting,your array is : "+ Arrays.toString(arr));
    }
    public static void binSort(int[] arr) {
        // code here
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                c++;
            }
        }
        for(int i=0;i<c;i++)
        {
            arr[i]=0;
        }
        for(int i=c;i<arr.length;i++)
        {
            arr[i]=1;
        }
    }
}
