package HomePractice.GeeksForGeeks.Arrays;
import java.util.Arrays;
import java.util.Scanner;

/*
Given two different arrays arr1[] and arr2[], the task is to merge the two unsorted arrays and return a sorted array.

Examples:

Input: arr1[] = [10, 5, 15] , arr2[] = [20, 3, 2]
Output: [2, 3, 5, 10, 15, 20]
Explanation: After merging both the array's and sorting it with get the desired output.
Input: arr1[] = [1, 10, 5, 15] , arr2[] = [20, 0, 2]
Output: [0, 1, 2, 5, 10, 15, 20]
Expected Time Complexity: O (nlogn + mlogm + (n + m))
Expected Auxiliary Space: O(n+m).
 */
public class MargingTwoUnsortedArrayInSortingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st array size:");
        int n1= sc.nextInt();
        int []arr1 = new int[n1];
        System.out.println("Enter the 1st array elements:");
        for(int i=0;i<n1;i++)
        {
            System.out.print("arr1["+i+"]=");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the 2nd array size:");
        int n2= sc.nextInt();
        int []arr2 = new int[n2];
        System.out.println("Enter the 2nd array elements:");
        for(int i=0;i<n2;i++)
        {
            System.out.print("arr2["+i+"]=");
            arr2[i] = sc.nextInt();
        }
        int res[] =new int[n1+n2];
        sortedMerge(arr1,arr2,res);
        System.out.println(Arrays.toString(res));
    }
    public static void sortedMerge(int[] arr1, int[] arr2, int[] res) {
        // code here
        int idx=0;

        for(int i=0;i<arr1.length;i++)
        {
            res[idx++]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            res[idx++]=arr2[i];
        }

        Arrays.sort(res);
    }
}
