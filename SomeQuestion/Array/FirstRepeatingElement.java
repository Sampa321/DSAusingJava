package HomePractice.GeeksForGeeks.Arrays;

import java.util.HashMap;
import java.util.Scanner;

/*
Given an array arr[], find the first repeating element. The element should occur more than
once and the index of its first occurrence should be the smallest.

Note:- The position you return should be according to 1-based indexing.

Examples:

Input: arr[] = [1, 5, 3, 4, 3, 5, 6]
Output: 2
Explanation: 5 appears twice and its first appearance is at index 2 which is less than 3 whose first the occurring index is 3.
Input: arr[] = [1, 2, 3, 4]
Output: -1
Explanation: All elements appear only once so answer is -1.
 */
public class FirstRepeatingElement {
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
        System.out.println("First repeated index : "+firstRepeated(arr));
    }
    public static int firstRepeated(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:arr)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])>=2)
            {
                return i+1;
            }
        }
        return -1;
    }
}
