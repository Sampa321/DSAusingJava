package HomePractice.GeeksForGeeks.Arrays;

import java.util.HashMap;
import java.util.Scanner;

/*
Given an array arr[]. The array contains numbers ranging from 0 to k-1 where k is a positive integer. Find the maximum repeating number in this array. If there are two or more maximum repeating numbers, return the element with the least value.

Examples:

Input: k = 3, arr[] = [2, 2, 1, 2]
Output: 2
Explanation: 2 is the most frequent element.
Input: k = 3, arr[] = [2, 2, 1, 0, 0, 1]
Output: 0
Explanation: 0, 1, and 2 all have the same frequency of 2. But since 0 is the smallest, you need to return 0.

 */
public class MaximumRepeatingNumber {
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
        System.out.print("Enter the value of  k  : ");
        int k=sc.nextInt();
        System.out.println("Maximum repeating element : "+maxRepeating(k,arr));
    }
   static int maxRepeating(int k, int[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:arr)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int max=-1;
        int res=-1;
        for(int i=0;i<k;i++)
        {
            if(map.containsKey(i))
            {
                if(map.get(i)>max)
                {
                    max=map.get(i);
                    res=i;
                }
            }
        }
        return res;
    }
}
