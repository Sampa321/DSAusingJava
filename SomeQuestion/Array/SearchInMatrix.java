package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;

/*
Given a 2D integer array mat[][] and a number x, find whether element x is present in the matrix or not.
Examples:

Input: mat[][] = [[6, 23, 21],[4, 45, 32],[69, 11, 87]], x = 32
Output: true
Explanation: 32 is present in the matrix, so the output is 1.
Input: mat[][] = [[14, 34, 23, 95, 43, 28]], x = 55
Output: false
Explanation: 55 is not present in the matrix, so the output is 0.
Input: mat[][] = [[87, 9, 99],[101, 3, 111]], x = 101
Output: true
Explanation: 101 is present in the matrix.
 */
public class SearchInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of matrix : ");
        int r=sc.nextInt();
        System.out.print("Enter the column of matrix : ");
        int c= sc.nextInt();
        int [][]matrix = new int[r][c];
        System.out.println("Enter the matrix element : ");
        for(int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                System.out.print("matrix["+i+"]["+j+"]=");
                matrix[i][j] =sc.nextInt();
            }
        }
        System.out.print("Enter the search element : ");
        int search =sc.nextInt();
        if(searchMatrix(matrix,search))
            System.out.println("Search element found");
        else System.out.println("Search element not found");
    }
    public static boolean searchMatrix(int[][] mat, int x) {
        // code here

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==x)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
