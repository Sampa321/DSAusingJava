package ClassPractice.Leedcode.Arrays.Easy.SortArrayByParityII;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
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
public class NaiveApproach {
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
        //Approach-1
        int []b=new int[nums.length];
        int ei=0;
        int oi=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                b[ei]=nums[i];
                ei+=2;
            }
            else {
                b[oi]=nums[i];
                oi+=2;
            }
        }
        return b;
        /* Approach-2
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int ele:nums)
        {
            if(ele%2==0)
            {
                even.add(ele);
            }
        }
        for(int ele:nums)
        {
            if(ele%2!=0)
            {
                odd.add(ele);
            }
        }
        int idx=0;
        for(int i=0;i<odd.size();i++)
        {
            nums[idx++]=even.get(i);
            nums[idx++]=odd.get(i);
        }
        return nums;*/
    }
}
