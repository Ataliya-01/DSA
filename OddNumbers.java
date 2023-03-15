/* ODD NUMBERS

You have to keep taking integers as input until you get an odd number as input. Your output will be N, which represents the number of numbers you had to take as input uptill encountering an odd number.

Input Format
You will be given N-1 even numbers followed by an odd number.

Output Format
For each test case print the value of N in a new line.

Example 1
Input

4
8
6
10
12
13
Output

6
Explanation

The sixth integer was an odd number.

Example 2
Input

8
13212
332
134
4418
909
Output

6
Explanation

The sixth integer was an odd number.

 */
 
 
import java.util.*;
  
class OddNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		for(int i=1; i<100001; i++){
			int n = sc.nextInt();
			if(n % 2 == 1){
			ans = i;
				break;
			}
		}
		System.out.println(ans);
		//int n;
		//int count = 0;
		//do{
		//	count++;
		//	n = sc.nextInt();
		//}while(n%2==0);
		//		System.out.println(count);
			}
		}
	

