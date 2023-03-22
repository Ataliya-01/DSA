/* Sum of Array

Write a program to find sum of all elements present in an array (arr[ ]). Take input of size of array (N) from user followed by the elements of array. After taking input, make variable sum and add all the elements of the array to the sum variable till you reach the last element of the array.

Input Format
First line contains an integer N denoting size of array.

Second line contains N integers denoting the array elements separated by single space.

Output Format
Print sum of the array elements

Example 1
Input

5
1 2 3 4 4
Output

14
Explanation

1+2+3+4+4 = 14
Example 2
Input

3
1 2 3
Output

6
Explanation

1+2+3 = 6
 */


import java.io.*;
import java.util.*;

class SumOfArray

{
    static int findSum(int arr[],int N){
        // code here
		int sum = 0;
		for(int i = 0; i<N; i++){
			 sum+=arr[i];
		}
		return sum;
    }
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // array size
        int arr[]=new int[N] ;// creating array of size N

        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt(); // taking input of array elements
        }

        int ans=findSum(arr,N);
        System.out.println(ans); // printing the sum
    }
}