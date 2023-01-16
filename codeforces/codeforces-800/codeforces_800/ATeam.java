
// https://codeforces.com/problemset/problem/231/A
//3- 800

package codeforces_800;
import java.util.Scanner;
public class ATeam {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		int numOfProb=sc.nextInt();
		int[][] attemptMatrix=new int[numOfProb][3];
		for(int i=0; i<numOfProb ; i++) {
			for(int j=0; j<3 ; j++) {				
				attemptMatrix[i][j]=sc.nextInt();				
			}
			int tempCount=0;
			for(int j=0 ; j<3 ; j++) {
				if(attemptMatrix[i][j]!=0) {
					tempCount++;
				}
			}
			
			if(tempCount>=2) {
				count++;
			}
		}
        System.out.print(count);
	}

}
