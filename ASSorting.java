/* AS Sorting 1

Write a program to sort a given matrix mat[][] of dimensions N*M (row and column) in column wise order.

Your task is to sort each column of a matrix in ascending order and finally print the updated matrix/2D Array.

Input Format
First line contains integer N and M denoting the rows and columns of matrix mat[][]

Each of the next N lines contains M integers denoting the matrix elements

Output Format
Print the matrix after sorting column wise

Example 1
Input

3 5
9 7 8 11 21
1 4 3 7 2
4 3 14 9 12
Output

1 3 3 7 2  
4 4 8 9 12 
9 7 14 11 21
Explanation

The matrix is sorted column wise

Example 2
Input

5 9
9 14 62 23 25 25 41 33 95
78 7 30 97 51 35 41 42 92
79 32 45 30 62 92 87 8 19
52 100 36 11 57 85 73 91 54
90 94 98 21 12 79 80 78 72
Output

9 7 30 11 12 25 41 8 19 
52 14 36 21 25 35 41 33 54 
78 32 45 23 51 79 73 42 72 
79 94 62 30 57 85 80 78 92 
90 100 98 97 62 92 87 91 95 
Constraints
1 <= N <= 20
1 <= M <= 20
-10^6<=mat[i][j]<=10^6
 */


import java.util.*;

class Solution{

	    public static void sortCol(int[][] mat, int N, int M){
        // Write your code and print here
		for(int c = 0; c<M ; c++){
			for(int r = 0; r<N-1; r++){
				int mini = r;
				for(int i = r; i<N; i++){
					if(mat[mini][c]>mat[i][c]){
						mini = i;
					}
				}
				if(mini!=r){
					int temp = mat[mini][c];
					mat[mini][c] = mat[r][c];
					mat[r][c] = temp;
				}
			}
		}
		}
}

public class ASSorting  {
        public static void main(String[] args) throws Throwable {
         Scanner sc=new Scanner(System.in); 
          int n=sc.nextInt();
          int m=sc.nextInt();
          int[][] mat =new int[n][m]; 
          for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                mat[i][j] = sc.nextInt();
            }
          } 
          Solution.sortCol(mat, n, m);
			for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
				System.out.print(mat[i][j]+" ");
	       }
				System.out.println();
}
		}
}