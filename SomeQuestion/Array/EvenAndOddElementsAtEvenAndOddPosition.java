package HomePractice.GeeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/*
Given an array arr[], the task is to arrange the array such that odd elements occupy the odd positions and even elements occupy the even positions. The order of elements must remain the same. Consider zero-based indexing. After printing according to conditions, if remaining, print the remaining elements as it is.

Examples:

Input: arr[] = [1, 2, 3, 4, 5, 6]
Output: [2, 1, 4, 3, 6, 5]
Explanation: Even elements are at even position and odd elements are at odd position keeping the order maintained.
Input:  arr[] = [3, 7, 4, 1]
Output: [4, 3, 7, 1]
 */
public class EvenAndOddElementsAtEvenAndOddPosition {
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
        System.out.println("Final array is : "+arrangeOddAndEven(arr));
    }
    public static ArrayList<Integer> arrangeOddAndEven(int arr[]) {
        // write code here
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Separate even and odd numbers
        for (int ele : arr) {
            if (ele % 2 == 0) {
                evens.add(ele);
            } else {
                odds.add(ele);
            }
        }

        // Alternate adding from even and odd lists
        int i = 0, j = 0;
        while (i < evens.size() && j < odds.size()) {
            result.add(evens.get(i++));
            result.add(odds.get(j++));
        }

        // Add remaining evens (if any)
        while (i < evens.size()) {
            result.add(evens.get(i++));
        }

        // Add remaining odds (if any)
        while (j < odds.size()) {
            result.add(odds.get(j++));
        }

        return result;
    }
}
