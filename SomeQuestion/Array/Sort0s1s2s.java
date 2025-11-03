package HomePractice.GeeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
Note: You need to solve this problem without utilizing the built-in sort function.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order
 */
public class Sort0s1s2s {
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
        sort012(arr);
        System.out.println("After sort array,your array is : "+ Arrays.toString(arr));
    }
    public static void sort012(int[] arr) {
        // code here
        ArrayList<Integer> list0 =new ArrayList<>();
        ArrayList<Integer> list1 =new ArrayList<>();
        ArrayList<Integer> list2 =new ArrayList<>();
        for(int ele:arr)
        {
            if(ele==0)
            {
                list0.add(ele);
            }
        }
        for(int ele:arr)
        {
            if(ele==1)
            {
                list1.add(ele);
            }
        }
        for(int ele:arr)
        {
            if(ele==2)
            {
                list2.add(ele);
            }
        }
        int idx=0;
        for(int ele:list0)
        {
            arr[idx++]=ele;
        }
        for(int ele:list1)
        {
            arr[idx++]=ele;
        }
        for(int ele:list2)
        {
            arr[idx++]=ele;
        }
    }
}
