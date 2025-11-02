package ClassPractice.Leedcode.Arrays.MovesZeroSolution;

import java.util.Arrays;
import java.util.Scanner;

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
public class MovesZeroEfficientApproach {
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
        System.out.println("Before moves zero, your array is : "+ Arrays.toString(arr));
        movesZero(arr);
    }
    public static void movesZero(int []arr){
        int i=-1;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==0)
            {
                i=j;
                break;
            }
        }
        if(i==-1)
        {
            return;
        }
        for(int j=i+1;j< arr.length;j++)
        {
            if(arr[j]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        System.out.println("After moves zero, your array is : "+ Arrays.toString(arr));
    }
}
