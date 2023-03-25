/* Spiral Matrix 2

You are given a matrix with N rows and M columns. You have to start iterating downwards on the first column and then continue spirally. Print an array containing the spiral of the matrix in the said manner.

NOTE: You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format:
The first line contains the number of test cases.

For each test case: The first line contains N and M.

The next N lines contain M integers each representing the elements of the matrix.

Output Format:
Print an array containing the spiral of the matrix in the said manner.

Example 1:
Input:

1
3 3
1 4 7
2 5 8
3 6 9
Output:

1 2 3 6 9 8 7 4 5
Explanation:

We iterate spirally and print each element.

Example 2:
Input:

1
3 3
1 2 3
4 5 6
7 8 9
Output:

1 4 7 8 9 6 3 2 5
Explanation:

We iterate spirally and print each element.
 */


import java.io.*;
import java.util.*;
class SpiralMatrix2{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++)
                 arr[i][j] = sc.nextInt();
            }

            ArrayList<Integer> ans = spirallyTraverse(arr, n, m);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }

    public static ArrayList<Integer> spirallyTraverse(int arr[][], int n, int m){
        ArrayList<Integer>list = new ArrayList<>();
			int top = 0;
            int left = 0;
            int right = m-1;
            int bottom = n-1;
                
            while(top  <= bottom && left <= right ){
            // top to bottom
            for(int i=top; i<=bottom; i++){
                list.add(arr[i][top]);
				
            }
            left++;
            // left to right
            for(int i=left; i<= right; i++){
                list.add( arr[bottom][i]);
				
            }
            bottom--;
            // Right to top
            if(left <= right){
            for(int i=bottom; i>=top; i--)
               list.add(arr[i][right]);
				
            }
            right--;
            // right top to left
             
            for(int i=right; i>=left; i--)
                list.add(arr[top][i]);
            top++;
				
            
                
                
            }
		return list;
	}
}