package codeup;
import java.util.*;

public class CODEUP1022 { // 문장 1개 입력받아 그대로 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // 공백 문자가 포함된 문장 입력
		
		System.out.println(str);
		sc.close();
	}
}