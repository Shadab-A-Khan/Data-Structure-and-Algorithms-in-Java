// https://codeforces.com/problemset/problem/791/A
// 13- 800

package codeforces_800;
import java.util.Scanner;
public class BearAndBigBrother {
 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int bearWeight=sc.nextInt();
        int bobWeight=sc.nextInt();
        int year=0;
        while(bearWeight<=bobWeight) {
        	bearWeight=3*bearWeight;
        	bobWeight=2*bobWeight;
        	year++;
        }
        System.out.print(year);
	}
 
}
