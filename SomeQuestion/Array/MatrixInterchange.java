package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;

/*
Working with 2D arrays is quite important. Here we will do swapping of columns in a 2D array. You are given a matrix arr[][] of r rows and c columns. You need to swap the first column with the last column.

Example:

Input:
r = 3
c = 4
arr[][] = {{1, 2, 3, 4},
           {4, 3, 2, 1},
           {6, 7, 8, 9}}
Output:
4 2 3 1
1 3 2 4
9 7 8 6
 */
public class MatrixInterchange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the matrix row:");
        int r= sc.nextInt();
        System.out.println("Enter the matrix column:");
        int c = sc.nextInt();
        int [][]matrix = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("matrix["+i+"]["+j+"]=");
                matrix[i][j] =sc.nextInt();
            }
        }
        interchange(matrix,r,c);
    }
    static void interchange(int matrix[][], int r, int c) {
        // code here
        for(int i=0;i<r;i++)
        {

            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][c-1];
            matrix[i][c-1] = temp;

        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
