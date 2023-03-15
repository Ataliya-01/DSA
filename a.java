import java.util.*;
class Solution{
	public int lengthOfLastWord(String s) {
	for(int i = s.length()-1; i>0; i--){
		if(s.charAt(i) =='s')
		return;
	}
	}
}
	public class a {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextln();
        Solution Obj = new Solution();
        Obj.lengthOfLastWord(s);
	}
}