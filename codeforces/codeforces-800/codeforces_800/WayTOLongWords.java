
// https://codeforces.com/problemset/problem/71/A
//2- 800

package codeforces_800;
import java.util.*;
public class WayTOLongWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numberOfWords=sc.nextInt();
        for(int i=0 ; i<numberOfWords ; i++) {
        	String str=sc.next();
        	if(str.length()<=10) {
        		System.out.println(str);
        	}else {
        		System.out.println(str.charAt(0)+""+(str.length()-2)+""+str.charAt(str.length()-1));
        	}
        }
	}

}
