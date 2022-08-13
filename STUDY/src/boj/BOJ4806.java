package boj;
import java.util.*;

public class BOJ4806 { // 줄 세기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		while (sc.hasNext()) {
			String str = sc.nextLine();
			cnt++;
		}
		
		System.out.println(cnt);
		sc.close();
	}
}