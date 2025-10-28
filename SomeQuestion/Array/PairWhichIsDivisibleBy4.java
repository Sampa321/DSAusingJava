package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;

/*
Given an array arr[] of positive integers, count the number of pairs of integers in the array that have the sum divisible by 4.

Examples:

Input : arr[] = [2, 2, 1, 7, 5]
Output : 3
Explanation: (2,2), (1,7) and (7,5) are the 3 pairs.
Input : arr[] = [2, 2, 3, 5, 6]
Output : 4
Explanation: (2,2), (2,6), (3,5) and (2,6) are the 4 pairs.

 */
public class PairWhichIsDivisibleBy4 {
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
        System.out.println("Count 4 divisible : "+count4Divisibiles(arr));
    }
    public static int count4Divisibiles(int arr[]) {
        // Complete the function
        int ans=0;
        int []mod=new int[4];
        for(int x:arr)
        {
            int rem=x%4;
            ++mod[rem];
        }
        ans+=mod[0]*(mod[0]-1)/2;
        ans+=mod[1]*mod[3];
        ans+=mod[2]*(mod[2]-1)/2;
        return ans;
    }
}
