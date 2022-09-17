package boj;
import java.util.*;

public class BOJ14581 { // 팬들에게 둘러싸인 홍준
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = ":" + sc.next() + ":"; // 홍준의 아이디
		String fan = ":fan:";
		
		System.out.println(fan + fan + fan);
		System.out.println(fan + str + fan);
		System.out.println(fan + fan + fan);
		sc.close();
	}
}