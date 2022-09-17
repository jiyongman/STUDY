package boj;
import java.util.*;

public class BOJ4470 { // 줄번호
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine()); // 줄의 수
		
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			
			System.out.println((i + 1) + ". " + str);
		}
		
		sc.close();
	}
}