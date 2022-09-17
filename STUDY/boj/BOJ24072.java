package boj;
import java.util.*;

public class BOJ24072 { // 帰省 (Homecoming)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // the number of days Bitaro will arrive at his parents' house in the morning
		int B = sc.nextInt(); // the number of days Bitaro will leave his parents' house in the morning
		int C = sc.nextInt(); // the number of days Bibako will visit Bitaro's parents' house in the afternoon
		
		if (A <= C && B > C) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		sc.close();
	}
}