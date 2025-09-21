package HomePractice.GeeksForGeeks.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Given an unsorted array arr[] and two elements num1 and num2. The task is to count the number of elements that occur between the given elements (excluding num1 and num2). If there are multiple occurrences of num1 and num2, we need to consider the leftmost occurrence of num1 and the rightmost occurrence of num2.

Examples:

Input: arr[] = [4, 2, 1, 10, 6], num1 = 4, and num2 = 6
Output: 3
Explanation: We have an array [4, 2, 1, 10, 6] and num1 = 4 and num2 = 6. So, the left most index of num1 is 0 and rightmost index of num2 is 4. So, the total number of element between them is [2, 1, 10] So, answer is 3.
Input: arr[] = [3, 2, 1, 4], num1 = 2, and num2 = 4
Output: 1
Explanation: here in array [3, 2, 1, 4] only one element [1] occur between 2 and 4, So, answer is 1.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).
 */
public class CountNumberOfElementsBetweenTwoGivenElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arrayList size:");
        int n =sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the arrayList elements:");
        for(int i=0;i<n;i++)
        {
            int ele = sc.nextInt();
            list.add(ele);
        }
        System.out.print("Enter the search 1st element:");
        int num1=sc.nextInt();
        System.out.print("Enter the search 2nd element:");
        int num2=sc.nextInt();
        int r = getCount(list,num1,num2);
        System.out.println("Count number of element between two given element:"+r);
    }
    public static int getCount(ArrayList<Integer> arr, int num1, int num2) {
        // Your Code goes here.
        int firstindex=-1;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)==num1)
            {
                firstindex=i;
                break;
            }
        }
        int lastindex=-1;
        for(int i=arr.size()-1;i>=0;i--)
        {
            if(arr.get(i)==num2)
            {
                lastindex=i;
                break;
            }
        }
        if(lastindex<firstindex)
        {
            return 0;
        }
        return (lastindex-firstindex-1);
    }
}
