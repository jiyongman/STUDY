package codeup;
import java.util.*;

public class CODEUP1020 { // 주민번호 입력받아 형태 바꿔 출력하기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.replaceAll("-", ""); // "-" 문자를 ""로 치환
		
		System.out.println(str);
		sc.close();
	}
}