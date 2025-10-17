package HomePractice.GeeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/*
Given an array arr, you need to reverse a subarray of that array. The range of this subarray is given by indices l and r (1-based indexing).

Examples:

Input: arr[] = [1, 2, 3, 4, 5, 6, 7], l = 2, r = 4
Output: [1, 4, 3, 2, 5, 6, 7]
Explanation: After reversing the elements in range 2 to 4 (2, 3, 4), modified array is 1, 4, 3, 2, 5, 6, 7.
Input: arr[] = [1, 6, 7, 4], l = 1, r = 4
Output: [4, 7, 6, 1]
Explanation: After reversing the elements in range 1 to 4 (1, 6, 7, 4), modified array is 4, 7, 6, 1.
 */
public class ReverseSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arrayList size:");
        int n=sc.nextInt();
        System.out.println("Enter the arrayList elements:");
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int ele = sc.nextInt();
            list.add(ele);
        }
        System.out.print("Enter the value of low :");
        int l=sc.nextInt();
        System.out.print("Enter the value of r:");
        int r=sc.nextInt();
        System.out.println("reverse sub array,your arrayList is : "+reverseSubArray(list,l,r));
    }
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l, int r){
        int i = l-1;
        int j = r-1;
        while(i < j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        return arr;
    }
}
