package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;
import java.util.Arrays;
/*
Given an array arr[] representing the size of candles which is reduced by 1 unit each day. The room is illuminated using all the present candles. Find the maximum number of days the room will stay illuminated (at least one candle having a size greater than 0)

Examples:

Input: arr[] = [1, 1, 2]
Output: 2
Explanation: The candle's length is reduced by 1 in first day. So, at the end of day 1: Sizes would be [0 0 1], So, at end of second day: Sizes would be [0 0 0]. This means the room was illuminated for 2 days.
Input: arr[] = [2, 3, 4, 2, 1]
Output: 4
 */

public class FightingDarkness {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        long r = maxDays(arr);
        System.out.println("Result is : "+r);
    }

    static long maxDays(int arr[]) {
        // code here
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

}
