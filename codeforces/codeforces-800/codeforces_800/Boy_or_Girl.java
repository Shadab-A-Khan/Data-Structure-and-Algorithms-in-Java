// https://codeforces.com/problemset/problem/236/A?csrf_token=ead4273ef5be66491eaab21007b6305a
// 11- 800

package codeforces_800;
import java.util.Scanner;
import java.util.HashMap;
public class Boy_or_Girl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		HashMap<Character, Boolean> map = new HashMap<>();
		String uniCharStr="";
		for(int i=0;i<name.length(); i++) {
			if(map.containsKey(name.charAt(i))) {
				continue;
			}else {
				uniCharStr+=name.charAt(i);
				map.put(name.charAt(i), true);
			}
		}
		if(uniCharStr.length()%2!=0) {
			System.out.println("IGNORE HIM!");
		}else {
			System.out.print("CHAT WITH HER!");
		}

	}

}
