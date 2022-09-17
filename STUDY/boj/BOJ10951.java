package boj;
import java.util.*;

public class BOJ10951 { // A + B - 4

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		while(sc.hasNextInt()) { // 정수형일 때만 true 반환
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A + B);
		}
		
		sc.close();
	}
}