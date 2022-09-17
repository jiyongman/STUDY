package boj;
import java.util.*;

public class BOJ10824 { // 네 수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		String D = sc.next();
		long AB = Long.parseLong(A + B);
		long CD = Long.parseLong(C + D);
		
		System.out.println(AB + CD);
		sc.close();
	}
}