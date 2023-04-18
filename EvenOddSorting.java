/* Even Odd Sorting

Implement Odd-Even sort /Brick sort.

Input Format
The first line  contains one integer 'N' denoting the number of elements.

The Second line  contains 'N' space separated integers denoting the elements of the array.

Output Format
Print the array in sorted fashion.

Example 1
Input

6
7 6 8 5 4 9
Output

4 5 6 7 8 9
Explanation

Printed sorted array.

Example 2
Input

5
11 5 12 6 13
Output

5 6 11 12 13
Explanation

Printed sorted array.

Constraints
0 <= nums.length <= 10^4

-1 0^9 <= nums[i] <= 10^9
*/


import java.util.*;

public class EvenOddSorting {
    static void oddEvenSort(int a[], int n)
    {
        //Write your code here
		Arrays.sort(a);
			for(int i = 0; i<n; i++){
				System.out.print(a[i]+" ");
			
		}
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        oddEvenSort(array,n);
    }
}