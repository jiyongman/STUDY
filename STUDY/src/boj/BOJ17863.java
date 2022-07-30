package boj;
import java.util.*;

public class BOJ17863 { // FYI
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // the 7-digit positive integer
		
		if (5550000 <= N && N < 5560000) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		sc.close();
	}
}