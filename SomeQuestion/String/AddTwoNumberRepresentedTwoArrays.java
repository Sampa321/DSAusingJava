package HomePractice.GeeksForGeeks.String;

import java.math.BigInteger;
import java.util.Scanner;

/*
Given two arrays arr1 and arr2, representing two numbers such that every element of arrays represents a digit. The task is to find the sum of both the numbers.

Examples:

Input : arr1[] = [1, 2], arr2[] = [2, 1]
Output : 33
Explanation: arr1[]=[1,2] number represented by first array is 12. arr2[] = [2, 1] number represented by second array is 21. Sum = 12 + 21 = 33.
Input : arr1[] = [9, 5, 4, 9], arr2[] = [2, 1, 4]
Output : 9763
Explanation : sum of 9549 and 214 is 9763.
 */
public class AddTwoNumberRepresentedTwoArrays {
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
        System.out.println("Result string is : "+calc_Sum(arr1,arr2));
    }
    static String calc_Sum(int arr1[], int arr2[]) {
        // Complete the function
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        for(int ele:arr1)
        {
            num1.append(ele);
        }
        for(int ele:arr2)
        {
            num2.append(ele);
        }
        BigInteger bigNum1 =new BigInteger(num1.toString());
        BigInteger bigNum2 =new BigInteger(num2.toString());
        BigInteger sum = bigNum1.add(bigNum2);
        return sum.toString();
    }
}
