//https://codeforces.com/problemset/problem/977/A
//16- 800
package codeforces_800;
import java.util.*;
public class WrongSubtraction {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int operations=sc.nextInt();
		for(int i=0; i<operations ; i++) {
			int temp=n%10;
			if(temp==0) {
				n=n/10;
			}else {
				n--;
			}
		}
        System.out.print(n);
	}

}
