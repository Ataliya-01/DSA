/* Maximum difference between two elements in an Array

Write a program to find out the maximum difference between any two element in an array.
Note: if an element is arr[i] and another element is arr[j] then difference will be |arr[i]-arr[j]| .

Input Format
First line contains n size of the array.

Second line contains n elements of the array. Elements will always be positive integers.

n will always be greater than 1.

Output Format
Print the maximum difference between any two element of an array.

Example 1
Input

4
16 24 89 35
Output

73
Explanation

Maximum possible difference is in pair (16,89) which is 73

Example 2
Input

5
9 1 2 8 7
Output

8
Explanation

Maximum possible difference is in pair (9,1) which is 8

 */




import java.io.*;
import java.util.*;


public class MaximumDifferenceBetweenTwoElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
        }
        ArrayProblem(arr);  
    }

    
    public static void ArrayProblem(int []arr) {
       

		// int max_diff = arr[1] - arr[0];
  //       int min_element = arr[0];
  //       int i;
  //       for (i = 1; i <arr.length; i++) 
  //       {
  //           if (arr[i] - min_element > max_diff)
  //               max_diff = arr[i] - min_element;
  //           if (arr[i] < min_element)
  //               min_element = arr[i];
  //       }
  //       System.out.println(max_diff);
	
			Arrays.sort(arr);
			int n = arr.length;
			int difference = arr[n-1]-arr[0];
			System.out.println(difference);
		}
    }

		

