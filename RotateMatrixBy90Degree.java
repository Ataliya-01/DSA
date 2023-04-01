/* Rotate a Matrix by 90 Degree

You are given a n x n 2-D matrix representing an image, rotate the image by 90 degrees (clockwise).

Input Format
The first line will contain two integers n and n again.

The next n lines contain n integers each representing the matrix.

Output Format
Print a matrix that is rotated by 90 degrees in the clockwise direction.

Example 1
Input

2 2 
1 2
2 3 
Output

2 1 
3 2
Explanation

We do a 90 degree clockwise rotation of the matrix.

Example 2
Input

3 3
7  2  3 
2  3  4 
5  6  1 
Output

5 2 7
6 3 2
1 4 3
Explanation

We do a 90 degree clockwise rotation of the matrix.

Constraints
1 <= n <= 100
 */


import java.util.*;
import java.lang.*;
import java.io.*;

public class RotateMatrixBy90Degree
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
   Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
    int m=sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
     for(int i=0; i<n; i++){
       for(int j=0; j<i; j++){
         int temp = matrix[i][j] ;
           matrix[i][j]= matrix[j][i];
         matrix[j][i] = temp;
       }
     }   
     for(int i=0; i<n; i++){
       for(int j=0; j<n/2; j++){
         int temp = matrix[i][n-j-1] ;
           matrix[i][n-j-1]= matrix[i][j];
         matrix[i][j] = temp;
       }
     }   
     print(matrix);
    }
  public static void print(int ans[][]){
        for(int i=0; i<ans.length; i++){
           for(int j=0; j<ans[0].length; j++){
              System.out.print(ans[i][j] + " ");
            } 
         System.out.println();
        }
    }
}