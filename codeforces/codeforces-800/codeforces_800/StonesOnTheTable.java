// https://codeforces.com/problemset/problem/266/A
//12- 800

package codeforces_800;
import java.util.Scanner;
import java.util.HashMap;
public class StonesOnTheTable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String colors=sc.next();
		int count=0;
        for(int i=0; i<n-1 ; i++) {
        	if(colors.charAt(i)==colors.charAt(i+1)) {
        		count++;
        	}
        	
        }
        System.out.print(count);
	}

}

