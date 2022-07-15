package codeup;
import java.util.*;

public class CODEUP1027 { // 년월일 입력 받아 형식 바꿔 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.next().split("\\.");
		
		System.out.println(arr[2] + "-" + arr[1] + "-" + arr[0]);
		sc.close();
	}
}