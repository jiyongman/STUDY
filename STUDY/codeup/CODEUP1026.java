package codeup;
import java.util.*;

public class CODEUP1026 { // 시분초 입력받아 분만 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.next().split(":"); // ":"를 기준으로 나눈 값을 배열에 입력
		
		if (arr[1].equals("00")) {
			System.out.println(0);
		} else {
			System.out.println(arr[1]);
		}
		
		sc.close();
	}
}