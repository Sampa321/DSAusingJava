package HomePractice.LeedCode.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

/* 349.
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */
public class IntersectionOfTwoArray {
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
        System.out.println("Insertion array is :"+Arrays.toString(intersection(arr1,arr1)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        for(int ele:nums1)
        {
            set1.add(ele);
        }
        for(int ele:nums2)
        {
            set2.add(ele);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele:set1)
        {
            if(set2.contains(ele))
            {
                list.add(ele);
            }
        }
        int re[]=new int[list.size()];
        int index=0;
        for(int ele:list)
        {
            re[index++]=ele;
        }
        return re;
    }
}
