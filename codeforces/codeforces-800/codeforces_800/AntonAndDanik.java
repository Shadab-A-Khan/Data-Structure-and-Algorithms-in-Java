//https://codeforces.com/problemset/problem/734/A
//20 -800

package codeforces_800;
import java.util.Scanner;
public class AntonAndDanik {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		int Anton=0;
		int Danik=0;
		for(int i=0; i<n; i++) {
			if(str.charAt(i)=='A') {
				Anton++;
			}else if(str.charAt(i)=='D') {
				Danik++;
			}
		}
        if(Anton>Danik) {
        	System.out.print("Anton");
        }else if(Danik>Anton) {
        	System.out.print("Danik");
        }else {
        	System.out.print("Friendship");
        }
	}

}
