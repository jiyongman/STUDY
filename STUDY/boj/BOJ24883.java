package boj;
import java.util.*;

public class BOJ24883 { // 자동완성
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if (ch == 'N' || ch == 'n') {
			System.out.println("Naver D2");
		} else {
			System.out.println("Naver Whale");
		}
		
		sc.close();
	}
}