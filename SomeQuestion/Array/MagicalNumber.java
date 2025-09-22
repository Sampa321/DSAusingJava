package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;

/*
Your friend loves magic and he has coined a new term - "Magical number". To perform his magic, he needs that magic number. You are given a sorted array arr of distinct integers. A number arr[i] is a magical number if arr[i] = i (0-based indexing).
You have to return the leftmost magical number present in the given array arr, if there is no magical number in the array arr then return -1

Examples:

Input: arr[] = [-2, -1, 2, 4, 6]
Output: 2
Explanation: There is only one magical number present at index 2 because arr[2] = 2.
Input: arr[] = [-1, 1, 2, 3, 5, 7]
Output: 1
Explanation: There are three magical numbers 1,2 and 3 present in the array, so leftmost magical number is 1.
Input: arr[] = [-12, 0, 1, 2, 3, 4]
Output: -1
Explanation: There is no magical numbers present in the array, so the output is -1.

 */
public class MagicalNumber {
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
        int r = findMagicalNumber(arr);
        System.out.println("Magical number is : "+r);
    }
    public static int findMagicalNumber(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==i)
            {
                return i;
            }
        }
        return -1;
    }
}
