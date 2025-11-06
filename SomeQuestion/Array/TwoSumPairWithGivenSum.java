package ClassPractice.geeksforGeeks.Arrays.Easy;
import java.util.Arrays;
import java.util.Scanner;

/*
Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.

Examples:
Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: arr[3] + arr[4] = -3 + 1 = -2
Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: None of the pair makes a sum of 0
Input: arr[] = [11], target = 11
Output: false
Explanation: No pair is possible as only one element is present in arr[]
 */
public class TwoSumPairWithGivenSum {
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
        if(twoSum(arr,target))
        {
            System.out.println("Target element found");
        }
        else {
            System.out.println("Target element not found");
        }
    }
   static boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        while(l<r)
        {
            int temp=arr[l]+arr[r];
            if(temp==target)
            {
                return true;
            }
            else if(temp<target)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return false;
    }
}
