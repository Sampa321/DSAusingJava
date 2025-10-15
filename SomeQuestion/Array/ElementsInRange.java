package HomePractice.GeeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/*
Given an array arr[] containing positive elements. A and B are two numbers defining a range. The task is to check if the array contains all elements in the given range (inclusive).

Note: If the array contains all elements in the given range return true otherwise return false.

Examples :

Input: n = 7, A = 2, B = 5, arr[] =  {1, 4, 5, 2, 7, 8, 3}
Output: True
Explanation: It has all elements between range 2-5 i.e 2,3,4,5.
Input: n = 7, A = 2, B = 6, arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: False
Explanation: The array does not contain 6 hence it do not contains all elements in the range 2-6, the output is No.
 */
public class ElementsInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n =sc.nextInt();
        System.out.println("Enter the array elements:");
        int []arr =new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of A : ");
        int A =sc.nextInt();
        System.out.print("Enter the value of B : ");
        int B = sc.nextInt();
        Boolean checkElement = check_elements(arr,n,A,B);
        if(checkElement)
        {
            System.out.println("All elements presents A tO B in array");
        }
        else
        {
            System.out.println("All elements are not presents A tO B in array");
        }
    }
   static boolean check_elements(int arr[], int n, int A, int B) {

        ArrayList<Integer> list =new ArrayList<>();
        for(int ele:arr)
        {
            list.add(ele);
        }
        for(int i=A;i<=B;i++)
        {
            if(!list.contains(i))
            {
                return false;
            }

        }
        return true;
    }
}
