package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;
import java.util.Arrays;
/*
Given an array arr[] of integers. Write a program to check whether an arithmetic progression can be formed using all the given elements.

Examples:

Input: arr[] = [0, 12, 4, 8]
Output: true
Explanation: Rearrange given array as [0, 4, 8, 12] which forms an arithmetic progression.
Input: arr[] = [12, 40, 11, 20]
Output: false
Explanation: there is no rearrangment which can forms an arithmetic progression.
 */
public class CheckArithmeticProgression {
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
        boolean r =checkIsAP(arr);
        System.out.println("Arithmetic progression possible ? "+r);
    }
    public static boolean checkIsAP(int[] arr) {
        // Your code goes here
        Arrays.sort(arr);
        int r =arr[1]-arr[0];
        boolean flag = true;
        for(int i=2;i<arr.length;i++)
        {
            if((arr[i]-arr[i-1]) ==r){
                flag = true;
            }
            else
            {
                return false;
            }
        }
        return flag;
    }
}
