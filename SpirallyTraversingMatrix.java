/* Spirally traversing a matrix

Given a matrix of size r*c, where r is number of rows and c is number of columns. Traverse the matrix in spiral form.

Input Format
Input consists of two lines

The first line contains two integers r and c which denotes number of rows and columns respectively.

The next r lines contains c spaced integers, which are the elements of the matrix.

Output Format
Print the spiral matrix.

Example 1
Input

4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Output

1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Explanation:

We iterate spirally and print each element.

Example 2
Input

3 4  
1 2 3 4
5 6 7 8
9 10 11 12
Output

1 2 3 4 8 12 11 10 9 5 6 7
Explanation:

We iterate spirally and print each element.

Constraints
1 <= r, c <= 100

0 <= matrix[i][j] <= 100
 */



import java.util.*;
import java.lang.*;
import java.io.*;

public class SpirallyTraversingMatrix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
 Scanner sc = new Scanner(System.in);
     	int r = sc.nextInt();
    	int c = sc.nextInt();
    	int mat[][] = new int[r][c];
    	for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
          mat[i][j] = sc.nextInt();
        }
      }
    	int fr = 0;
    	int fc = 0;
    	int lr = r-1;
    	int lc = c-1;
    	int total = r*c;
    	int cnt = 0;
   	while(total > cnt){
    	for(int i=fc; i<=lc && total > cnt; i++){
      	System.out.print(mat[fr][i]+" ");
        cnt++;
    	}
      fr++;
      for(int i=fr; i<=lr && total > cnt; i++){
        System.out.print(mat[i][lc]+" ");
        cnt++;
      }
      lc--;
      for(int i=lc; i>=fc && total > cnt; i--){
        System.out.print(mat[lr][i]+" ");
        cnt++;
      }
      lr--;
      for(int i=lr; i>=fr && total > cnt; i--){
        System.out.print(mat[i][fc]+" ");
        cnt++;
      }
      fc++;
   }
  }
}