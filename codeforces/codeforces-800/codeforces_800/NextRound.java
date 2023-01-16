
// https://codeforces.com/problemset/problem/158/A
// 4- 800

package codeforces_800;

import java.util.Scanner;
public class NextRound {

	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   int arraySize=sc.nextInt();
	   int k=sc.nextInt();

	   int[] contestentScore= new int[arraySize];
	   for(int i=0; i<arraySize  ; i++) {
		   contestentScore[i]=sc.nextInt();
	   }
	   
	   int kthValue=contestentScore[k-1];
	   int count=0;
	   for(int i=0; i<arraySize ; i++) {
		   if(contestentScore[i]>=kthValue && contestentScore[i]>0) {
			   count++;
		   }
	   }
	   System.out.print(count);
	}

}