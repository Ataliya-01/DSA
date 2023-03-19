/* Array Adding

You have given a number n1, representing the size of array arr1. You have given n1 numbers, representing elements of array arr1. You have given a number n2, representing the size of array arr2.You have given n2 numbers, representing elements of array arr2. The two arrays represent digits of two numbers.

You are required to add the numbers represented by two arrays and print the arrays. n1 and n2 are of diferent size

Input Format
First line consists of an integer n1

Second line consists of n1 spaced integers, representing elements of arr1

Third line consists of an integer n2

Fourth line consists of n2 spaced integers, representing elements of arr2

Output Format
Add the two numbers and print the array

Example 1
Input

3
1 2 3
3
3 2 1
Output

4
4
4
Explanation

Adding corresponding elements gives 4 at each index -> 1 + 3 = 2 + 2 = 3 + 1 = 4

Example 2
Input

2
2 1
4
1 2 3 4
Output

1
2
5
5
Explanation

1234 + 21 = 1255

 */


// Java program to sum two numbers
// represented two arrays.
import java.util.*;
// Can do a dry dun for 99 + 999
public class ArrayAdding {
  static void calSum(int arr1[], int arr2[], int n1, int n2) {
	  int maxm = Math.max(n1, n2);
	  int ans[] = new int[maxm + 1];
	  int i = n1 - 1; // iterator for arr1
	  int j = n2 - 1;
	  int k = ans.length - 1; // maxm

	  int carry = 0, sum = 0;
	  while(i >= 0 || j >= 0){
		  sum = 0;
		  if(i >= 0){ // arr1 has elements that we can process
			  sum += arr1[i];
			  i--;
		  }
		  if(j >= 0){ // arr2 has elements that we can process
			  sum += arr2[j];
			  j--;
		  }
		  sum += carry;
		  carry = sum / 10; // for the next iteration

		  ans[k] = sum % 10;
		  k--;
	  }
	  ans[k] = carry; // either 1 or 0

	  for(k = 0; k <= maxm; k++){
		  if(k == 0 && ans[k] == 0)
			  continue; // moves to the next iteration
		  System.out.println(ans[k]);
	  }
  }

 
  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    calSum(arr1, arr2, n1, n2);
    // for (int i : res) System.out.println(i);
  }
}