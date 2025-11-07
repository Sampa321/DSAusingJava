package ClassPractice.Leedcode.Arrays.Easy.SortArrayByParityII;

import java.util.Arrays;
import java.util.Scanner;

/* 922.
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.
Example 1:
Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:
Input: nums = [2,3]
Output: [2,3]
 */
public class EfficientApproach {
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
    System.out.println("Sort array by parity II, your array is : "+Arrays.toString(sortArrayByParityII(arr)));
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int ei=0; //it will search for an odd element at even index
        int oi=1; //it will search for an even element at odd in dex
        int n=nums.length;
        while (ei<n && oi<n)
        {
            while (ei< n &&nums[ei]%2==0)
            {
                ei+=2;
            }
            while (oi<n &&nums[oi]%2!=0)
            {
                oi+=2;
            }
            if(ei<n && oi<n)
            {
                int temp=nums[ei];
                nums[ei]=nums[oi];
                nums[oi]=temp;
            }
        }//outer while loop end
        return nums;
    }
}
