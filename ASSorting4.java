/* AS Sorting 4

Given a set of N distinct points lying on the X-axis and an integer L, the task is to find the number of ways of selecting three points such that the distance between the most distant points is less than or equal to L

Input Format
The first line contains integer N denoting the number of points

The second line contains N integers denoting the points

The third line contains L denoting the maximum distance possible

Output Format
Print the count of the total ways of selecting three points

Example 1
Input

4
2 1 3 4
3
Output

4
Explanation

{1, 2, 3} Here distance between farthest points = 3 – 1 = 2 <= L

{1, 2, 4} Here distance between farthest points = 4 – 1 = 3 <= L

{1, 3, 4} Here distance between farthest points = 4 – 1 = 3 <= L

{2, 3, 4} Here distance between farthest points = 4 – 2 = 2 <= L

Example 2
Input

4
2 1 3 4
2
Output

2
Explanation

{1, 2, 3} Here distance between farthest points = 3 – 1 = 2 <= L

{2, 3, 4} Here distance between farthest points = 4 – 2 = 2 <= L

Constraints
1 <= N <= 100

0 <= points <= 1000

1 <= L <= 500
 */



import java.util.*;
import java.io.*;
public class ASSorting4 {
    static int sorting4(int n, int[] arr, int l){
        //Write your code here
		Arrays.sort(arr);
		int ways = 0;	
	
		 for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
					int mostDistantDistance =
                                    arr[k] - arr[i];
                    if (mostDistantDistance <= l)
                    {
                        ways++;
					}
				}
			}
		
    }
		return ways;
	}

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        int[] arr = new int[n];

        inputLine = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]);
        }
        inputLine = br.readLine().trim().split(" ");
        int l = Integer.parseInt(inputLine[0]);

        int ans= sorting4(n, arr, l);
        System.out.println(ans);
    }
}