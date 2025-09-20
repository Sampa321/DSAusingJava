package HomePractice.GeeksForGeeks.Arrays;
import java.util.Arrays;
import java.util.Scanner;

/*
Given an unsorted array arr[]. Find the subarray arr[s...e] such that sorting this subarray makes the whole array sorted.

Note: If the given array is already sorted then return [0, 0].

Examples:

Input: arr[] = [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60]
Output: [3, 8]
Explanation: Sorting subarray starting from index 3 and ending at index 8 results in sorted array. Initial array: [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], Final array: [10, 12, 20, 25, 30, 31, 32, 35, 40, 50, 60](After sorting the bold part).
Input: arr[] = [0, 1, 15, 25, 6, 7, 30, 40, 50]
Output: [2, 5]
Explanation: Sorting subarray starting from index 2 and ending at index 5 results in sorted array. Initial array: [0, 1, 15, 25, 6, 7, 30, 40, 50], Final array: [0, 1, 6, 7, 15, 25, 30, 40, 50](After sorting the bold part).
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
 */
public class SortUnsortedSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        printUnsorted(arr);
    }
    public static void printUnsorted(int[] arr) {
        // Code here
        int []temp = new int[arr.length];
        int []result = new int[2];
        for(int i=0;i<arr.length;i++)
        {
            temp[i]=arr[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=temp[i])
            {
                result[0]=i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]!=temp[i])
            {
                result[1]=i;
                break;
            }
        }
        System.out.println(result[0]+" "+result[1]);
    }
}
