package HomePractice.LeedCode.Array.Medium;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
 */
public class FindFirstAndLastPositionElementInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target element :");
        int target = sc.nextInt();
        System.out.println("Target element index is : "+ Arrays.toString(searchRange(arr,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int []re=new int[2];
        int findex=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                findex=i;
                break;
            }
        }
        int lindex=-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                lindex=i;
                break;
            }
        }
        re[0]=findex;
        re[1]=lindex;
        return re;
    }
}
