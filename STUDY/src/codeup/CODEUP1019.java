package codeup;
import java.util.*;

public class CODEUP1019 { // 연월일 입력받아 그대로 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.next().split("\\."); // .을 기준으로 분리해야 하는 경우 "\\." 사용
		int y = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int d = Integer.parseInt(arr[2]);
		
		System.out.println(String.format("%04d", y) + "." + String.format("%02d", m) + "." + String.format("%02d", d));
		sc.close();
	}
}