// https://codeforces.com/problemset/problem/116/A
//19- 800

package codeforces_800;
import java.util.*;
public class Tram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int numberOfStops=sc.nextInt();
		int minSeat=0;
		int passenger=0;
		for(int i=0; i<numberOfStops ; i++) {
			int exit=sc.nextInt();			
			int enter=sc.nextInt();
			passenger=passenger-exit;
			passenger=passenger+enter;
			
			if(passenger>minSeat) {
				minSeat= passenger;
			}
			
		}
        System.out.print(minSeat);
	}

}
