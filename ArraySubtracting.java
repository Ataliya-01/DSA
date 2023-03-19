/* Array Subtracting


You have given a number n1, representing the size of array arr1. You have given n1 numbers, representing elements of array arr1. You have given a number n2, representing the size of array arr2.You have given n2 numbers, representing elements of array arr2. The two arrays represent digits of two numbers.

You are required to subtract the numbers represented by two arrays and print the arrays. n1 and n2 are of different size

Input Format
First line consists of an integer n1

Second line consists of n1 spaced integers, representing elements of arr1

Third line consists of an integer n2

Fourth line consists of n2 spaced integers, representing elements of arr2

Output Format
Subtract the two numbers and print the array

Example 1
Input

3
3 2 1
3
1 2 3
Output

1
9
8
Explanation

321 - 123 = 198

Example 2
Input

4
1 2 3 4
2
2 1
Output

1
2
1
3
Explanation

1234 - 21 = 1213
 */


// Java program to sum two numbers
// represented two arrays.
import java.util.*;

public class ArraySubtracting {
static int nega=0;

  static int[] subtract(int[] n1, int[] n2) {
   int maxi=Math.max(n1.length,n2.length);
	  int[] diff=new int[maxi];
	  int index=maxi-1;
	  int i=n1.length-1;
	  int j=n2.length-1;
	  int carry = 0;
	  while(i>=0 || j>=0)
		  {
			  int f = i >= 0 ? n1[i] : 0;
			  int s = j >= 0 ? n2[j] : 0;
			  int sum  = f - s + carry;
			  if(sum < 0){
				  sum += 10;
				  carry = -1;
			  }
			  else carry = 0;
			  diff[index] = sum;
			  index--;
			  i--;
			  j--;
		  }
	  if(carry < 0){
		  nega = 1;
		  return subtract(n2, n1);
	  }
	  
	  else
	  {
		 if(nega == 1) diff[0] *= -1;
		  return diff;
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

    int[] res = subtract(arr1, arr2);
    for (int i : res) System.out.println(i);
  }
}