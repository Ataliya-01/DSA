/* Buildings

You have given a number n, representing the size of array arr. You are given n numbers, representing elements of array arr.

You are required to print a bar chart representing value of arr.

Input Format
First line consists of an integer n

Second line consists of n spaced integers, representing elements of arr

Output Format
Output the Bar Graph of the array arr

Example 1
Input

7
9 3 7 6 2 0 4
Output

*
*
*               *
*               *       *
*               *       *
*               *       *                       *
*       *       *       *                       *
*       *       *       *       *               *
*       *       *       *       *               *
Explanation

Number of stars in each column represent the value of that index of array arr

Example 2
Input

5
1 2 3 4 5
Output

                                *
                        *       *
                *       *       *
        *       *       *       *
*       *       *       *       *
Explanation

Number of stars in each column represent the value of that index of array arr
 */



import java.util.*;

public class Buildings {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      max = Math.max(max, arr[i]);
    }
    sc.close();
    barGraph(arr, n);
  }

  public static void barGraph(int[] arr, int n) {
    // your code here
	  int maxm = maxElement(arr, n);
	  int rows = maxm;
	  for(int i =1; i<=rows; i++){
		  for(int j = 0; j<n; j++){
			  if(arr[j]>=maxm){
				  System.out.print("*\t");
			  }else{
				  System.out.print("\t");
			  }
		  }
		   maxm--;
		  System.out.println();
	  }
		 
	  
  }
	  public static int maxElement(int[] arr, int n){
	  int maxm = arr[0];
	  for(int i = 0; i<n; i++){
		  if(arr[i]>maxm){
			  maxm = arr[i];
		  }
	  }
		  return maxm;
    }
  }
