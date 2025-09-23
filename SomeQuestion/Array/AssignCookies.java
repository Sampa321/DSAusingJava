package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;
import java.util.Arrays;
/*
You are given an array greed[], where greed[i] represents the minimum size of cookie required to satisfy the i-th child, and an array cookie[], where cookie[j] represents the size of the j-th cookie. Each child can receive at most one cookie. A child i will be satisfied if they receive a cookie j such that cookie[j] >= greed[i]. Your task is to determine the maximum number of children that can be satisfied.

Examples:

Input : greed[] = [1, 10, 3], cookie = [1, 2, 3]
Output: 2
Explanation: We can only assign cookie to the first and third child.
Input : greed[] = [10, 100], cookie = [1, 2]
Output: 0
Explanation: We can not assign cookies to any child.
 */
public class AssignCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the greed size:");
        int n1= sc.nextInt();
        int []greed = new int[n1];
        System.out.println("Enter the greed elements:");
        for(int i=0;i<n1;i++)
        {
            System.out.print("greed["+i+"]=");
            greed[i] = sc.nextInt();
        }
        System.out.print("Enter the cookie size:");
        int n2= sc.nextInt();
        int []cookie = new int[n2];
        System.out.println("Enter the cookie elements:");
        for(int i=0;i<n2;i++)
        {
            System.out.print("cookie["+i+"]=");
            cookie[i] = sc.nextInt();
        }
        int r = maxChildren(greed,cookie);
        System.out.println("The result is : "+r);
    }
    public static int maxChildren(int[] greed, int[] cookie) {
        // code here
        int l = 0;
        int r =0;
        Arrays.sort(greed);
        Arrays.sort(cookie);
        while(l<greed.length && r<cookie.length)
        {
            if(greed[l]<=cookie[r])
            {
                l++;
            }
            r++;
        }
        return l;
    }
}
