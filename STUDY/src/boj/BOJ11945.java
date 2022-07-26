package boj;
import java.util.*;

public class BOJ11945 { // 뜨거운 붕어빵
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			while (sc.hasNext()) {
				String str = sc.next();
				StringBuffer sb = new StringBuffer(str);
				String reverse = sb.reverse().toString();
				System.out.println(reverse);
			}
		}
		
		sc.close();
	}
}