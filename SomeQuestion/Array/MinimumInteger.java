package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;

/*
You are given an array A of size N. Let us denote S as the sum of all integers present in the array. Among all integers present in the array, find the minimum integer X such that S ≤ N*X.

Example 1:

Input:
N = 3,
A = { 1, 3, 2}
Output:
2
Explanation:
Sum of integers in the array is 6.
since 6 ≤ 3*2, therefore 2 is the answer.
Example 2:

Input:
N = 1,
A = { 3 }
Output:
3
Explanation:
3 is the only possible answer
 */
public class MinimumInteger {
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
        System.out.println("Minimum integer : "+minimumInteger(n,arr));
    }
    public static int minimumInteger(int N, int[] A) {
        // code here
        long sum=0;
        long ans=Long.MAX_VALUE;
        for(int ele:A)
        {
            sum+=ele;
        }
        for(int i:A)
        {
            if(sum<=(long)N*(long)i)
                ans=Math.min(ans,i);
        }
        return (int)ans;
    }
}
