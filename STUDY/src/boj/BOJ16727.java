package boj;
import java.util.*;

public class BOJ16727 { // ICPC
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int p1 = sc.nextInt(); // the number of goals scored by Persepolis in the first match
		int s1 = sc.nextInt(); // the number of goals scored by Esteghlal in the first match
		int s2 = sc.nextInt(); // the number of goals scored by Esteghlal in the second match
		int p2 = sc.nextInt(); // the number of goals scored by Persepolis in the second match
		
		if (p1 + p2 > s1 + s2) {
			System.out.println("Persepolis");
		} else if (p1 + p2 < s1 + s2) {
			System.out.println("Esteghlal");
		} else if (p1 + p2 == s1 + s2) {
			if (p2 > s1) {
				System.out.println("Persepolis");
			} else if (p2 < s1) {
				System.out.println("Esteghlal");
			} else {
				System.out.println("Penalty");
			}
		}
		
		sc.close();
	}
}