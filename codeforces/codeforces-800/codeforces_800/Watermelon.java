
// https://codeforces.com/problemset/problem/4/A
//1- 800

package codeforces_800;

import java.util.Scanner;
public class Watermelon {

	public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       int weight=sc.nextInt();

    	   if(weight%2==0 && weight>2) {
    		   System.out.print("YES");
    		  return;
    	   }
       
       System.out.print("NO");
	}

}
