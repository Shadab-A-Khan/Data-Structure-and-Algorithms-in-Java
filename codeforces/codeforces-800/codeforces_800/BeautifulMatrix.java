//https://codeforces.com/problemset/problem/263/A
//7- 100
package codeforces_800;
import java.util.Scanner;
public class BeautifulMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] Matrix = new int[5][5];

		for(int i=1; i<=5 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				int matrixVal=sc.nextInt();
				if(matrixVal==1) {
					System.out.println(Math.abs(i-3)+Math.abs(j-3));
					return;
				}
				
			}
			
		}

	}

}
