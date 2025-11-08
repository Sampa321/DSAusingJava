package ClassPractice.Leedcode.Arrays.Easy.SingleNumber;

import java.util.Scanner;

/* 136.
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
Example 3:
Input: nums = [1]
Output: 1
 */
public class EfficientApproachUsingXORgate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n= sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        System.out.println("single number is : "+singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int r=0;
        for(int i=0;i<nums.length;i++)
        {
            r^=nums[i];
        }
        return r;
    }
}
