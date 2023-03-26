/* Pascal's Triangle II

Given an number n, print the nth row of the Pascal's triangle.

Pascal Triangle

Your task is to complete the function pascalTriangleRow which receives n as the parameter and returns the nth row of the pascal's triangle.

Input Format
There is a single line of input representing n.

Output Format
Return the nth row of the Pascal’s triangle

Example 1
Input

4
Output

1 3 3 1
Explanation

The elements in the 4rd row are 1 3 3 1.

Example 2
Input

1
Output

1
Explanation

The elements in the 1st row are 1.

Constraints
1 <= n <= 30

 */


import java.util.*;

public class PascalsTriangleII {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> triangle = pascalTriangleRow(n);
        for (int i = 0; i < triangle.size(); i++) {
            System.out.print(triangle.get(i) + " ");
        }
    }

	public static ArrayList<Integer> pascalTriangleRow(int numRows) {
       
		int r=numRows, i,j,num;
		
		ArrayList<Integer> res=new ArrayList<>();
		
		for(i=r-1;i<r;i++){
			
			num=1;
			
		for(j=0;j<=i;j++){
			
			res.add(num);
			
			num=num*(i-j)/(j+1);
			
		}
		}
	return res;
}
}