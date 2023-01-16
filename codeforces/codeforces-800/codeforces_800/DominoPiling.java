//https://codeforces.com/problemset/problem/50/A
//05- 800
package codeforces_800;

import java.util.Scanner;
public class DominoPiling{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int areaOfTheBoard=m*n;
        int areaOfDomino=2*1;
        int numOfDominoFits= areaOfTheBoard/areaOfDomino;
        System.out.print(numOfDominoFits);        
    }
}
