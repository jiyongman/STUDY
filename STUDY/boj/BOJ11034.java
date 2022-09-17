package boj;
import java.util.*;

public class BOJ11034 { // 캥거루 세마리2
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int max = Math.max(B - A, C - B);
			
			System.out.println(max - 1);
		}
		
		sc.close();
	}
}