package ClassPractice.Leedcode.Arrays.Easy.SortArrayByParity;

import java.util.Arrays;
import java.util.Scanner;

/*  905.
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.
Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:
Input: nums = [0]
Output: [0]
 */
public class SortArrayByParityNeiveApproach {
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
        System.out.println("After sort array by parity ,your array is :"+ Arrays.toString(sortArrayByParity(arr)));
    }
    //Approach-1
    public static int[] sortArrayByParity(int[] nums) {
        int []result=new int[nums.length];
        int k=0;
        for(int ele:nums)
        {
            if(ele%2==0)
            {
                result[k++] = ele;
            }
        }
        for(int ele:nums)
        {
            if(ele%2!=0)
            {
                result[k++] = ele;
            }
        }
        return result;
    }

    //Approach-2
    /*public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even= new ArrayList<>();
        ArrayList<Integer> odd= new ArrayList<>();
        if(nums.length==0)
        {
            return nums;
        }
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
        for(int ele:even)
        {
            nums[idx++]=ele;
        }
        for(int ele:odd)
        {
            nums[idx++]=ele;
        }
        return nums;
    }*/
}
