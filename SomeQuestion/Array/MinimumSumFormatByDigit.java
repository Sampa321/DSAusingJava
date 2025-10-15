package HomePractice.GeeksForGeeks.Arrays;
import java.util.Arrays;
import java.util.Scanner;

/*
Given an array of digits (values are from 0 to 9), find the minimum possible sum of two numbers formed from digits of the array. All digits of the given array must be used to form the two numbers.

Any combination of digits may be used to form the two numbers to be summed.  Leading zeroes are permitted.

If forming two numbers is impossible (i.e. when n==0) then the "sum" is the value of the only number that can be formed.

Example 1:

Input:
N = 6
arr[] = {6, 8, 4, 5, 2, 3}
Output:
604
Explanation:
The minimum sum is formed by numbers
358 and 246


Example 2:

Input:
N = 5
arr[] = {5, 3, 0, 7, 4}
Output:
82
Explanation:
The minimum sum is formed by numbers
35 and 047
 */
public class MinimumSumFormatByDigit {
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
        System.out.println("Minimum sum : "+minSum(arr,n));
    }
    public static long minSum(int arr[], int n) {
        // Your code goes here
        Arrays.sort(arr);
        long fSum=0;
        long lSum=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                fSum=fSum*10+arr[i];
            }
            else
            {
                lSum=lSum*10+arr[i];
            }
        }
        return (fSum+lSum);
    }
}
