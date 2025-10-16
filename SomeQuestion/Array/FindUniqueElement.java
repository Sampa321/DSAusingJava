package HomePractice.GeeksForGeeks.Arrays;

import java.util.HashMap;
import java.util.Scanner;

/*
Given an array of elements occurring in multiples of k, except one element which doesn't occur in multiple of k. Return the unique element.

Examples:

Input: k = 3, arr[] = [6, 2, 5, 2, 2, 6, 6]
Output: 5
Explanation: Every element appears 3 times except 5.
Input: k = 4, arr[] = [2, 2, 2, 10, 2]
Output: 10
Explanation: Every element appears 4 times except 10.
 */
public class FindUniqueElement {
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
        System.out.print("Enter the value of k:");
        int k=sc.nextInt();
        System.out.println("Unique element is : "+findUnique(k,arr));
    }
    public static int findUnique(int k, int[] arr) {
        // code here
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int ele:arr)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele:arr)
        {
            if(map.get(ele)<k)
            {
                return ele;
            }
        }
        return 0;
    }
}
