package HomePractice.GeeksForGeeks.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Given an array arr[]. Find the majority element in the array. If no majority element exists, return -1.

Note: A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.

Examples:

Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
Output: 1
Explanation: Since, 1 is present more than 7/2 times, so it is the majority element.
Input: arr[] = [7]
Output: 7
Explanation: Since, 7 is single element and present more than 1/2 times, so it is the majority element.
Input: arr[] = [2, 13]
Output: -1
Explanation: Since, no element is present more than 2/2 times, so there is no majority element.
 */
public class MajorityElement {
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
        System.out.println("Majority element :"+majorityElement(arr));
    }
   static int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:arr)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int p=(arr.length/2);
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>p)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}
