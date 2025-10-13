package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;

/*
Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[].

Examples :

Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
Output: 4
Explanation: target = 2 occurs 4 times in the given array so the output is 4.
Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
Output: 0
Explanation: target = 4 is not present in the given array so the output is 0.

 */
public class NumberOfOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int []arr = new int[n];
        for(int i=0;i< arr.length;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element:");
        int target=sc.nextInt();
        System.out.println("No of target element present in array : "+countFreq(arr,target));
    }
   static int countFreq(int[] arr, int target) {
        // code here
        int c=0;
        for(int ele:arr)
        {
            if(ele==target)
            {
                c++;
            }
        }
        return c;
    }
}
