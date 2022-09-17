package boj;
import java.util.*;

public class BOJ20499 { // Darius님 한타 안 함?
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // 문자열을 입력받음
		String[] arr = str.split("/"); // 입력받은 문자열을 "/"를 기준으로 잘라 배열에 넣음
		int K = Integer.parseInt(arr[0]); // 배열에 들어있는 문자열을 정수형으로 변환
		int D = Integer.parseInt(arr[1]);
		int A = Integer.parseInt(arr[2]);
		
		if (K + A < D || D == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
		
		sc.close();
	}
}