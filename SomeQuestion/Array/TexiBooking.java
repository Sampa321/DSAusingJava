package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;

/*
You are going to book a taxi. There are infinite number of points 1, 2, 3... on the X axis and your current position is cur. There are N Taxis near you, and the position of those taxis is given as an array pos. Where pos[i] denotes the position of the ith taxi. You are also given an array time. Where time[i] denotes the time taken by the ith taxi to cover 1 unit of distance. Your task is to find the minimum time to board a taxi.

Example 1:

Input:
N = 3, cur = 4
pos = [1, 5, 6]
time = [2, 3, 1]
Output:
2
Explanation:
Total time taken by the 1st taxi will be: (4-1)*2 = 6
Total time taken by the 2nd taxi will be: (5-4)*3 = 3
Total time taken by the 3rd taxi will be: (6-4)*1 = 2
So, the minimum time will be 2 sec.


Example 2:

Input:
N = 2, cur = 1
pos = [1, 6]
time = [10, 3]
Output:
0
Explanation:
Total time taken by the 1st taxi will be: (1-1)*10 = 0
Total time taken by the 2nd taxi will be: (6-1)*3 = 15
So, the minimum time will be 0 sec.


Your Task:
You don't need to read input or print anything. Your task is to complete the function minimumTime() which takes two integers N and cur, and 2 arrays pos, and time as input parameters and returns the minimum time required to board the taxi.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
 */
public class TexiBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n =sc.nextInt();
        System.out.println("Enter the position:");
        int []pos = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("pos["+i+"]=");
            pos[i]=sc.nextInt();
        }
        System.out.println("Enter the time:");
        int []time = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("time["+i+"]=");
            time[i]=sc.nextInt();
        }
        System.out.print("Enter the current position:");
        int currentPosition =sc.nextInt();
        int minimumTime = minimumTime(n,currentPosition,pos,time);
        System.out.println("Minimum time : "+minimumTime);
    }
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
        int originalresult=Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            int d=0;
            if(pos[i]>cur)
            {
                d=pos[i]-cur;
            }
            else
            {
                d=cur-pos[i];
            }
            int result =d*time[i];
            if(originalresult>result)
            {
                originalresult = result;
            }
        }
        return originalresult;
    }
}
