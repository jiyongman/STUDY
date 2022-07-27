package boj;
import java.util.*;

public class BOJ13866 { // 팀 나누기

	public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		int C = sc.nextInt(); 
		int D = sc.nextInt(); 
		int diff = Math.abs((A + D) - (B + C)); // 절대값
		
		System.out.println(diff);
		sc.close();
	}
}