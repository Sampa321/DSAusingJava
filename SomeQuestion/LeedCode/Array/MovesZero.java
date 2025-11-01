package HomePractice.LeedCode.Array;

import java.util.Scanner;
import java.util.Arrays;

/* 283.
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */
public class MovesZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array element:");
        for (int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        moveZeroes(arr);
        System.out.println("After moves zero ,your array is : "+Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int []arr=new int[nums.length];
        if(nums.length==1)
        {
            return;
        }

        // int c=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==0)
        //     {
        //         c++;
        //     }
        // }
        // if(c==0)
        // {
        //     return ;
        // }
        int idx=0;
        for(int ele:nums)
        {
            if(ele!=0)
            {
                arr[idx++]=ele;
            }
        }

        int i=0;
        for(int ele:arr)
        {
            nums[i++]=ele;
        }
    }

}
