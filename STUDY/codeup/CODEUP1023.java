package codeup;
import java.util.*;

public class CODEUP1023 { // 실수 1개 입력받아 부분별로 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] arr = str.split("\\."); // .을 기준으로 split \\.
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		sc.close();
	}
}