package HomePractice.GeeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/*
Given two arrays arr1[] and arr2[], return the merged array in ascending order containing unique elements.

Examples:

Input: arr1[] = [11, 1, 8], arr2[] = [10, 11]
Output: [1, 8, 10, 11]
Explanation: The output array after merging both the arrays and removing duplicates is [1, 8, 10, 11]
Input: arr1[] = [7, 1, 5, 3, 9], arr2[]  = [8, 4, 3, 5, 2, 6]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Constraints:
1 ≤ arr1.size(), arr2.size() ≤ 104

 */
public class MergeAndSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st array size:");
        int n1= sc.nextInt();
        int []arr1 = new int[n1];
        System.out.println("Enter the 1st array elements:");
        for(int i=0;i<n1;i++)
        {
            System.out.print("arr1["+i+"]=");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the 2nd array size:");
        int n2= sc.nextInt();
        int []arr2 = new int[n2];
        System.out.println("Enter the 2nd array elements:");
        for(int i=0;i<n2;i++)
        {
            System.out.print("arr2["+i+"]=");
            arr2[i] = sc.nextInt();
        }
        System.out.println(mergeNsort(arr1,arr2));
    }
    public static ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        // code here
        HashSet<Integer> set =new HashSet<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int ele:arr1)
        {
            set.add(ele);
        }
        for(int ele:arr2)
        {
            set.add(ele);
        }
        for(int i:set)
        {
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }
}
