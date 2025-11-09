package HomePractice.LeedCode.Array.Medium;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
You are given an integer array arr of size n+2. All elements of the array are in the range from 1 to n. Also, all elements occur once except two numbers which occur twice. Find the two repeating numbers.
Note: Return the numbers in their order of appearing twice. So, if x and y are repeating numbers, and x's second appearance comes before the second appearance of y, then the order should be (x, y).

Examples:

Input: n = 4, arr[] = [1, 2, 1, 3, 4, 3]
Output: [1, 3]
Explanation: In the given array, 1 and 3 are repeated two times, and as 1's second appearance occurs before 2's second appearance, so the output should be 1 3.
Input: n = 2, arr[] = [1, 2, 2, 1]
Output: [2, 1]
Explanation: In the given array, 1 and 2 are repeated two times and second occurence of 2 comes before 1. So the output is 2 1.
 */
public class TwoRepeatedElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }
        System.out.println("Two repeated array element is : "+Arrays.toString(twoRepeated(arr)));
    }
    public static int[] twoRepeated(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        int []arr1 = new int[2];
        int idx=0;
        for(int ele:arr)
        {
            if(set.contains(ele))
            {
                arr1[idx++]=ele;
            }
            else
            {
                set.add(ele);
            }
        }
        return arr1;
    }
}
