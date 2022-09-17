package codeup;
import java.util.*;

public class CODEUP1044 { // 정수 1개 입력받아 1 더해 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		
		System.out.println(++a);
		sc.close();
	}
}