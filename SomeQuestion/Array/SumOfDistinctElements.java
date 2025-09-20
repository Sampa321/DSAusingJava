package HomePractice.GeeksForGeeks.Arrays;

import java.util.HashSet;
import java.util.Scanner;

/*
You are given an array arr. Find the sum of distinct elements in an array.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: 15
Explanation: Distinct elements are 1, 2, 3, 4, 5. So sum is 15.
Input: arr[] = [5, 5, 5, 5, 5]
Output: 5
Explanation: Only Distinct element is 5. So sum is 5.
Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 105
 */
public class SumOfDistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=sc.nextInt();
        System.out.println("Enter the array elements:");
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        int r =findSum(arr);
        System.out.println("Sum is : "+r);
    }
    static int findSum(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        int sum = 0;
        for(int ele:set)
        {
            sum+=ele;
        }
        return sum;
    }
}
