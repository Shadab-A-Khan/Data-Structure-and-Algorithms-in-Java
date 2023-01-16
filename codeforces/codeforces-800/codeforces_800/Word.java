// https://codeforces.com/problemset/problem/59/A
// 15- 800
package codeforces_800;
import java.util.Scanner;
public class Word {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		int i=0;
		int upperCaseCount=0;
		int lowerCaseCount=0;
		while(i<str.length()){
			int ascii=str.charAt(i);
			if(ascii>=97) {
				lowerCaseCount++;
			}else {
				upperCaseCount++;
			}
			i++;
		}

		if(upperCaseCount==lowerCaseCount) {
			System.out.print(str.toLowerCase());
		}else {
			if(upperCaseCount<lowerCaseCount) {				
				System.out.print(str.toLowerCase());
			}else {
				System.out.print(str.toUpperCase());
			}
		}

	}

}
