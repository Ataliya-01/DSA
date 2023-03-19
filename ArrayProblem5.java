/* Array Problem 5

Karan has an array arr and an integer k. He wants to find out the number of consecutive pairs of array elements whose sum will be k.

Write a program to count the number of consecutive pairs.

Note that, if arr[5]={1,2,3,4,5} then consecutive pairs are (1,2),(2,3),(3,4),(4,5).

Input Format
The first line contains n, the size of the array, and a positive integer k.

The second line contains n elements of the array.

Output Format
Return the number of consecutive pairs whose sum will be equal to k.

Example 1
Input

4 3
1 2 4 3
Output

1
Explanation

The number of pairs is 1 (1,2).

Example 2
Input

3 10
4 6 4
Output

2
Explanation

The number of pairs is 2 (4,6) and (6,4).
 */



import java.io.*;
import java.util.*;

public class ArrayProblem5 {

    public static int ArrayProblem(int []arr,int k){
       // Write code here
		//int sum = 0;
		int count = 0;
		int n = arr.length;
		for(int i = 0; i<n-1; i++){
			//for(int  j = i+1; j<i+2; j++){
				if(arr[i]+arr[i+1] == k){
					count++;
				}
			
	}
		return count;
	}
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
        }
        System.out.println(ArrayProblem(arr,k)); 
    }
}