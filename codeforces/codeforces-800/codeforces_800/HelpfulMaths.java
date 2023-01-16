//https://codeforces.com/problemset/problem/339/A
//9- 800

package codeforces_800;
import java.util.*;
public class HelpfulMaths {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
        String ans1=str.replace("+","");
        
        char []arr=new char[ans1.length()];
        for(int i=0; i<arr.length ; i++) {
        	arr[i]=ans1.charAt(i);
        }
        
       Arrays.sort(arr);
        String ans="";
        for(int i=0; i<arr.length ; i++){
        	ans+=arr[i]+"+";
        }
        System.out.print(ans.substring(0,ans.length()-1));
	}
 
}
