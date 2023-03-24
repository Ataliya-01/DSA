/* Find The Way

You are given a binary matrix of dimensions m*n. A mouse enters the matrix at cell (0,0) in left to right direction.

He goes in the same direction if he encounters a 0 and he takes a right turn when he encounters a 1, and changes that direction 1 to 0. Otherwise he may get stuck in a cycle!

You have to find the co-ordinates from where this mouse will exit the matrix.

Input Format
First line contains the values m and n.

Next m lines contain n spaced integers.

Output Format
Return the co-ordinates from where this mouse will exit the matrix separated by space.

Example 1
Input

1 2
0 0
Output

0 1
Explanation

The mouse will enter at (0,0) and keep going ahead and come out of (0,1).

Example 2
Input

3 3
0 1 0
0 1 0
1 0 1
Output

1 0
Explanation

We enter the matrix at (0,0) we move to (0,1) and encounter a 1 so we change it to 0 and move right to (1,1), we again encounter 1 and turn right.

Then we leave the matrix from (1,0). Thus the output is 1 0.
 */



import java.util.*;

public class FindTheWay {
    public static int[] findTheWay(int[][] mat) {
        //Write code here
		int dir=0;
		int m=mat.length;
		int n=mat[0].length;
		int ans[]=new int[2];
		//int dir=0;
		int i=0;
		int j=0;
		
		
		while(i<m && i>=0 && j<n && j>=0) {
			ans[0]=i;
			ans[1]=j;
			
			if(mat[i][j]==0){
				if(dir==0)j++;
				if(dir==1)i++;
				if(dir==2)j--;
				if(dir==3)i--;
				
			}else{
				if(dir==0)	{
					dir=1;
					i++;
					//mat[i][j]=0;
				}else if(dir==1){
					
					dir=2;
					j--;
				
				}else if(dir==2){
					
					dir=3;
					i--;
				}else if(dir==3){
					
					dir=0;
					j++;
				}
				//mat[i][j]=0;
				}
			}
		return ans;
		}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
		}
        int result[] = findTheWay(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}