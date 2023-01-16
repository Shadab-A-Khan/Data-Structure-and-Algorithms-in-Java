// https://codeforces.com/problemset/problem/546/A
// 14- 800
package codeforces_800;
import java.util.*;

public class SoldierAndBananas {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int k_initialCost=sc.nextInt();
        int n_doller=sc.nextInt();
        int w_bananaWant=sc.nextInt();
        int totalCost=0;
        
        for(int i=1; i<=w_bananaWant; i++) {
        	totalCost+=i*k_initialCost;
        }
        
        if(totalCost<=n_doller) {
        	System.out.print(0);
        	return;
        }
        
        System.out.print(Math.abs(totalCost-n_doller));

	}

}