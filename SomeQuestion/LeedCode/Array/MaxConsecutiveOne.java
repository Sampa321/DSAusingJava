package ClassPractice.Leedcode.Arrays.Easy.MaxConsecutiveOneSolution;

import java.util.Scanner;

/* 485.
Given a binary array nums, return the maximum number of consecutive 1's in the array.
Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 */
public class MaxConsecutiveOne {
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
        System.out.println("Max consecutive ones :"+findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                maxCount++;
            }
            else {
                maxCount=0;
            }
            if(maxCount>count)
            {
                count=maxCount;
            }
        }
        return count;
    }
}
