package boj;
import java.util.*;

public class BOJ16625 { // Das Blinkenlights
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt(); // the first light blinks every p seconds
		int q = sc.nextInt(); // the second light blinks every q seconds
		int s = sc.nextInt(); // the maximum number of seconds to consider when determining if the two lights blink at the same time
		int lcm = p * q / gcd(p , q); // 최소공배수
		
		if (lcm <= s) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		sc.close();
	}
	
	public static int gcd(int p, int q) { // 유클리드 호제법 (최대공약수 재귀식)
		if (q == 0) {
			return p;
		} else {
			return gcd(q, p % q);
		}
	}
}