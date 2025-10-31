package HomePractice.GeeksForGeeks.Arrays;

import java.util.HashMap;
import java.util.Scanner;

/*
Given an array arr[] (may contain duplicates) and positive integer k. The task is to count the number of elements that occur exactly floor(n/k) times in the array.

Examples:

Input: arr[] = [1, 4, 1, 2, 4], k=2
Output: 2
Explanation: In the given array, 1 and 4 occurs floor(5/2) = 2 times. So count is 2.
Input: arr[] = [99, 66, 66], k=2
Output: 1
Explanation: In the given array, 99 occurs floor(3/2) = 1 time. So count is 1.
 */
public class CountTheSpecials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of k:");
        int k=sc.nextInt();
        System.out.println("Count of special : "+countSpecials(arr,k));
    }
    static int countSpecials(int []arr, int k) {
        // your code here
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:arr)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int freq=(arr.length/k);
        for(int v:map.values())
        {
            if(v==freq)
            {
                ans++;
            }
        }
        return ans;
    }
}
