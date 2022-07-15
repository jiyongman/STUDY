package boj;
import java.util.*;

public class BOJ1264 { // 모음의 개수

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String str = sc.nextLine();
			int cnt = 0;
			
			if (str.equals("#")) { // "#" 입력 시 while문 탈출
				break;
			}
			
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || 
					str.charAt(i) == 'e' || str.charAt(i) == 'E' || 
					str.charAt(i) == 'i' || str.charAt(i) == 'I' || 
					str.charAt(i) == 'o' || str.charAt(i) == 'O' || 
					str.charAt(i) == 'u' || str.charAt(i) == 'U') {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
		
		sc.close();
	}
}