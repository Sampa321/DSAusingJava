package HomePractice.GeeksForGeeks.Arrays;
/*
Count Pairs whose sum is less than target
Given an array arr[] and an integer target. You have to find the number of pairs in the array whose sum is strictly less than the target.

Examples:

Input: arr[] = [7, 2, 5, 3], target = 8
Output: 2
Explanation: There are 2 pairs with sum less than 8: (2, 5) and (2, 3).
Input: arr[] = [5, 2, 3, 2, 4, 1], target = 5
Output: 4
Explanation: There are 4 pairs whose sum is less than 5: (2, 2), (2, 1), (3, 1) and (2, 1).
Input: arr[] = [2, 1, 8, 3, 4, 7, 6, 5], target = 7
Output: 6
Explanation: There are 6 pairs whose sum is less than 7: (2, 1), (2, 3), (2, 4), (1, 3), (1, 4) and (1, 5).
 */
import java.util.Arrays;
import java.util.Scanner;

public class CountPairSumLessThenTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target element:");
        int target = sc.nextInt();
        int r = countPairs(arr,target);
        System.out.println("Result is: "+r);
    }
    static int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int low=0;
        int high =arr.length-1;
        int c=0;
        while(low<high){
            if(arr[low]+arr[high]<target)
            {
                c+=(high-low);
                low++;
            }
            else
            {
                high--;
            }
        }
        return c;
    }
}
