/* Maximum occurrence

You are given an array arr of length n. Your task is to print the element which has maximum occurrences in the array. If two elements have the same occurrence then print the smaller element

Input Format
The first line of input contains an integer n, size of the array.

The next line contains n space seperated integers denoting the elements of the array.

Output Format
Print single integer denoting the maximum occurring element in the array.

Example 1
Input

8
7 7 6 4 8 7 3 1
Output

7
Explanation

We have arr = [7 7 6 4 8 7 3 1]

As 7 is occurring 3

Example 2
Input

7
9 8 1 1 2 2 3
Output

1
Explanation

1 and 2 have smae occurrence that is 2 so print smaller element i.e. 1.

Constraints
1 <= n <= 10^6

1 <= arr[i] <= 10^9

 */



import java.util.*;

public class MaximumOccurrence {
    static int maximum_occurrence(int arr[], int n) {
        //Write code here
		// if(arr.length<1){
		// 	retrun -1;
		// }
		
		Arrays.sort(arr);
		int maxcount = 0;
	    int element_having_max_freq = 0;
	    for (int i = 0; i < n; i++) {
	      int count = 0;
	      for (int j = 0; j < n; j++) {
	        if (arr[i] == arr[j]) {
	          count++;
        }
      }
 
	      if (count > maxcount) {
	        maxcount = count;
	        element_having_max_freq = arr[i];
      }
    }
 
    return element_having_max_freq;
  }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maximum_occurrence(arr, n));

    }
}
