package HomePractice.GeeksForGeeks.Arrays;

import java.util.HashMap;
import java.util.Scanner;

/*
Given an array arr, the goal is to find out the smallest number that is repeated exactly ‘k’ times.
Note: If there is no such element then return -1.

Example:

Input: arr[] = [2, 2, 1, 3, 1], k = 2
Output: 1
Explanation: Here in array, 2 is repeated 2 times, 1 is repeated 2 times, 3 is repeated 1 time. Hence 2 and 1 both are repeated 'k' times i.e 2 and min(2, 1) is 1 .
Input: arr[] = [3, 5, 3, 2], k = 1
Output:  2
Explanation: Both 2 and 5 are repeating 1 time but min(5, 2) is 2.
 */
public class SmallestNumberRepeatingKtimes {
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
        System.out.println("Smallest duplicated number of k times :"+findDuplicate(arr,k));
    }
    public static int findDuplicate(int[] arr, int k) {
        // code here

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:arr)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int ans=Integer.MAX_VALUE;
        for(int ele:map.keySet())
        {
            if(map.get(ele)==k)
            {
                ans =Math.min(ans,ele);
            }
        }
        if(ans==Integer.MAX_VALUE)
        {
            return -1;
        }
        return ans;
    }
}
