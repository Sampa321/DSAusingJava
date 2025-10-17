package HomePractice.GeeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*
Given an array arr of integers which may or may not contain duplicate elements. Your task is to remove duplicate elements.

Examples:

Input: arr[] = [1, 2, 3, 1, 4, 2]
Output: [1, 2, 3, 4]
Explanation: 2 and 1 have more than 1 occurence.
Input: arr[] = [1, 2, 3, 4]
Output: [1, 2, 3, 4]
Explanation: There is no duplicate element.
 */
public class RemoveDuplicateFromUnsortedArray {
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
        System.out.println("After remove duplicate element your arraylist is : "+removeDuplicate(arr));
    }
    public static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(set.add(arr[i]))
            {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
