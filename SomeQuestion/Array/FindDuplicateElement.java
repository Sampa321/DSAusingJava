package HomePractice.GeeksForGeeks.Arrays;
import java.util.Arrays;
import java.util.Scanner;

/*
Given a sorted array arr[] having 10 elements which contain 6 different numbers in which only 1 number is repeated five times. Your task is to find the duplicate number using two comparisons only.

Examples:

Input: arr[] = [1, 1, 1, 1, 1, 5, 7, 10, 20, 30]
Output: 1
Input: arr[] = [1, 2, 3, 3, 3, 3, 3, 5, 9, 10]
Output: 3
 */
public class FindDuplicateElement {
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
        int r=findDuplicate(arr);
        System.out.println("Duplicate element is : "+r);
    }
    public static int findDuplicate(int arr[]) {
        // Your code goes here
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                return arr[i];
            }
        }
        return 0;
    }
}
