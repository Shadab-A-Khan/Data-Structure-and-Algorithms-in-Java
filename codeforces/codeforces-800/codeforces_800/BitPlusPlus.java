// https://codeforces.com/problemset/problem/282/A
// 06- 800
package codeforces_800;
import java.util.Scanner;
public class BitPlusPlus {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x=0;

		int numOfOperation = sc.nextInt();
		for(int i=0; i<numOfOperation ; i++) {
			String operation=sc.next();
			if(operation.charAt(1)=='+') {
				x++;
			}else{
				x--;
			}
		}
        System.out.println(x);
	}

}