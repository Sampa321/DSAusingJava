package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;

/*
Given an array arr[], return the length of the longest subarray of non-negative integers.
Note: Subarray here means a continuous part of the array.

Examples:

Input: arr[] = [2, 3, 4, -1, -2, 1, 5, 6, 3]
Output: 4
Explanation: The subarray [ 1, 5, 6, 3] has longest length 4 and contains no negative integers
Input: arr[] = [1, 0, 0, 1, -1, -1, 0, 0, 1, 0]
Output: 4
Explanation: Subarrays [1, 0, 0, 1] and [0, 0, 1, 0] have equal lengths but sum of first one is greater so that will be the output.
 */
public class LengthOfLongestSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n= sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        int r = longestSubarray(arr);
        System.out.println("The result is : "+r);
    }
    public static int longestSubarray(int arr[]) {
        int count = arr[0]<0?0:1, max = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<0){
                max = Math.max(max, count);
                count = 0;
            }else{
                count++;
            }
        }
        max = Math.max(max, count);
        return max;

    }
}
