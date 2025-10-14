package HomePractice.GeeksForGeeks.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
Given an array arr and an element k. The task is to find the count of elements in the array that appear more than n/k times and n is length of arr.

Examples :

Input: arr = [3, 1, 2, 2, 1, 2, 3, 3], k = 4
Output: 2
Explanation: In the given array, 3 and 2 are the only elements that appears more than n/k times.
Input: arr = [2, 3, 3, 2], k = 3
Output: 2
Explanation: In the given array, 3 and 2 are the only elements that appears more than n/k times. So the count of elements are 2.

 */
public class MoreThanNDIVIDEDkOccurrence {
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
        System.out.print("Enter the value of k : ");
        int k=sc.nextInt();
        System.out.println("More than n/k occurrence : "+countOccurence(arr,k));
    }
    public static int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:arr)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        HashSet<Integer> s1 =new HashSet<>();
        for(int ele:arr)
        {
            if(map.get(ele)>(arr.length/k))
            {
                s1.add(ele);
            }
        }
        return s1.size();
    }
}
