package boj;
import java.util.*;

public class BOJ2083 { // 럭비 클럽
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String str = sc.next(); // 이름
			int a = sc.nextInt(); // 나이
			int w = sc.nextInt(); // 몸무게
			
			if (str.equals("#") && a == 0 && w == 0) {
				break;
			}
			
			if (a > 17 || w >= 80) {
				System.out.println(str + " Senior");
			} else {
				System.out.println(str + " Junior");
			}
		}
		
		sc.close();
	}
}