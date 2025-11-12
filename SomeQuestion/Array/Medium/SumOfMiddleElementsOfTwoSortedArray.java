package HomePractice.GeeksForGeeks.Arrays.Medium;

import java.util.Scanner;

/*
Given 2 sorted integer arrays arr1 and arr2 of the same size. Find the sum of the middle elements of two sorted arrays arr1 and arr2.

Examples:
Input: arr1 = [1, 2, 4, 6, 10], arr2 = [4, 5, 6, 9, 12]
Output: 11
Explanation: The merged array looks like [1, 2, 4, 4, 5, 6, 6, 9, 10, 12]. Sum of middle elements is 11 (5 + 6).
Input: arr1 = [1, 12, 15, 26, 38], arr2 = [2, 13, 17, 30, 45]
Output: 32
Explanation: The merged array looks like [1, 2, 12, 13, 15, 17, 26, 30, 38, 45]. Sum of middle elements is 32 (15 + 17).
Expected Time Complexity: O(log n)
Expected Auxiliary Space: O(1)
 */
public class SumOfMiddleElementsOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = sc.nextInt();
        int []arr1 = new int[n];
        System.out.println("Enter the 1st array elements : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr1["+i+"]=");
            arr1[i] = sc.nextInt();
        }
        int []arr2 = new int[n];
        System.out.println("Enter the 2nd array elements : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr2["+i+"]=");
            arr2[i] = sc.nextInt();
        }
        System.out.println("Sum of middle elements  : "+SumofMiddleElements(arr1,arr2));
    }
    public static int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        int []r=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int idx=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                r[idx++]=arr1[i++];
            }
            else
            {
                r[idx++]=arr2[j++];
            }
        }
        while(i<arr1.length)
        {
            r[idx++]=arr1[i++];
        }
        while(j<arr2.length)
        {
            r[idx++]=arr2[j++];
        }
        int mid=(r.length)/2;
        int re=r[mid-1]+r[mid];
        return re;
    }
}
