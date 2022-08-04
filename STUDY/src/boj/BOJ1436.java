package boj;
import java.util.*;

public class BOJ1436 { // 영화감독 숌
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 666;
		int cnt = 1;
		
		while (cnt != N) {
			num++;
			if (String.valueOf(num).contains("666")) { // 정수형인 num을 문자열로 변환, "666"이란 문자열을 포함하는 경우
				cnt++;
			}
		}
		
		System.out.println(num);
		sc.close();
	}
}