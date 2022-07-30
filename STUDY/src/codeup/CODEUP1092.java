package codeup;
import java.util.*;

public class CODEUP1092 { // 함께 문제 푸는 날

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int day = 1;
		
		while (day % a != 0 || day % b != 0 || day % c != 0) {
			day++;
		}
		
		System.out.println(day);
		sc.close();
	}
}