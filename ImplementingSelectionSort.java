/* Implementing Selection Sort

Given an array arr of size n, containing positive integers. You need to sort the elements of array using the Selection Sort algorithm.

Input Format
First line contains an integer n which is the size of array arr

Second line contains n space separated integers of arr

Output Format
Return the sorted array

Example 1
Input

5
4 1 3 9 7
Output

1 3 4 7 9
Explanation

The array after performing Selection sort: 1 3 4 7 9.

Example 2
Input

10
10 9 8 7 6 5 4 3 2 1
Output

1 2 3 4 5 6 7 8 9 10
Constraints
1 <= n <= 104

-106 <= A[i] <= 106
 */


import java.util.*;

public class ImplementingSelectionSort {
    public static int[] SelectionSort(int[] arr) {
        // Write your code here
		for(int i = 0; i<arr.length-1; i++){
			int smallest = i;
			for(int j = i+1; j<arr.length; j++){
				if(arr[smallest]>arr[j]){
				smallest = j;
			}
		}
		int temp = arr[smallest];
		arr[smallest] = arr[i];
		arr[i] = temp;
    }
		return arr;
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SelectionSort(arr);

        for(int a : ans)
            System.out.print(a + " ");
    }
}