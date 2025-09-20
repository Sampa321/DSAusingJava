package HomePractice.GeeksForGeeks.Arrays;
import java.util.Arrays;
import java.util.Scanner;

/*
Find the largest pair sum in an array of distinct integers.

Examples :

Input: arr[] = [12, 34, 10, 6, 40]
Output: 74
Explanation: Sum of 34 and 40 is the largest, i.e, 34 + 40 = 74.
Input: arr[] = [10, 20, 30]
Output: 50
Explanation: 20 + 30 = 50.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
 */
public class LargestPairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n= sc.nextInt();
        System.out.println("Enter the element in array:");
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        int largestPair = pairsum(arr);
        System.out.println("Largest pair is : "+largestPair);
    }
    public static int pairsum(int[] arr) {
        // code here
        Arrays.sort(arr);
        int sum = arr[arr.length-1]+arr[arr.length-2];
        return sum;
    }
}
