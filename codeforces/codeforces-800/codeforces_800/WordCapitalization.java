//https://codeforces.com/problemset/problem/281/A
//10- 800 

package codeforces_800;
import java.util.Scanner;
public class WordCapitalization {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    String str=sc.next();
	    
//	    int firstChar=str.charAt(0);
//	    if(firstChar>=97){
//	    	System.out.print((char)(firstChar-32)+str.substring(1));
//	    	return;
//	    }
//	    System.out.print(str);
	    
	    //OR
	    
	    System.out.print((str.substring(0,1)).toUpperCase()+str.substring(1));
	}

}
