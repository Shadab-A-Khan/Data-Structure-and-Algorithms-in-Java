// https://codeforces.com/problemset/problem/617/A
// 15- 800
package codeforces_800;
import java.util.Scanner;
public class Elephant {
	
	public static void minStep(int distance, int step , int[] storage) {
        for(int i=1; i<=5 ; i++) {
        	if(distance>5) {
        		storage[i]=1;
        	}else {
        		System.out.print(1);
        		return;
        	}
        	
        }
		
		for(int i=6; i<=distance; i++) {
           storage[i]=distance/5+storage[distance%5];
		}
		System.out.print(storage[distance]);
		
	}

	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int distance = sc.nextInt();
       int step=0;
       int [] storage=new int[distance+1];

       
       minStep(distance, 0, storage);
	}

}
