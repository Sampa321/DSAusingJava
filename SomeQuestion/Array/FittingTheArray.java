package HomePractice.GeeksForGeeks.Arrays;
import java.util.Arrays;
import java.util.Scanner;

/*
Geek is playing an array game. He is weak in the concepts of arrays. Geek is given two arrays arr[ ] and brr[ ] of the same size n. The array arr[ ] will be said to fit in array brr[ ] if by arranging the elements of both arrays, there exists a solution such that i'th element of arr[ ] is less than or equal to i'th element of brr[ ], for each i, 0 <= i < n. Help Geek find if the given array arr[ ] will fit in array brr[ ] or not.

Example 1:

Input: arr[] = {7, 5, 3, 2},
       brr[] = {5, 4, 8, 7} and n = 4
Output: YES
Explanation:
Transform arr[] = {2, 3, 5, 7} and
brr[] = {4, 5, 7, 8}.
Now, 2<=4, 3<=5, 5<=7 and 7<=8.
So arr[] array will fit in brr[] array.
Example 2:

Input: arr[] = {1, 2, 4},
       brr[] = {1, 2, 3} and n = 3
Output: NO
Explanation:
As 1<=1, 2<=2 but 4>3 so,
arr[] array will not fit in brr[] array.

 */
public class FittingTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st array size:");
        int n= sc.nextInt();
        int []arr1 = new int[n];
        System.out.println("Enter the 1st array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr1["+i+"]=");
            arr1[i] = sc.nextInt();
        }

        int []arr2 = new int[n];
        System.out.println("Enter the 2nd array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr2["+i+"]=");
            arr2[i] = sc.nextInt();
        }
        boolean r=isFit(arr1,arr2,n);
        if(r)
        {
            System.out.println("Array is already fitting!");
        }
        else {
            System.out.println("Array is not fitting");
        }
    }
    public static boolean isFit(int arr[], int brr[], int n) {
        // Complete the function
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0;i<n;i++)
        {
            if(arr[i]>brr[i])
            {
                return false;
            }
        }
        return true;
    }
}
