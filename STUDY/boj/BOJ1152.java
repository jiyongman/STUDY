package boj;
import java.util.*;

public class BOJ1152 { // 단어의 개수

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim(); // 문자열 공백 제거
		
		if (str.isEmpty()) {
			System.out.println('0');
		} else {
			System.out.println(str.split(" ").length); // 공백으로 문자열 분리
		}
		
		sc.close();
	}	
}