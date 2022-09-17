package boj;
import java.util.*;

public class BOJ4458 { // 첫 글자를 대문자로
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			
			System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1, str.length()));
		}
		
		sc.close();
	}
}