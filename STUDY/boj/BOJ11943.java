package boj;
import java.util.*;

public class BOJ11943 { // 파일 옮기기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 첫 번째 바구니에 있는 사과의 수
		int B = sc.nextInt(); // 첫 번째 바구니에 있는 오렌지의 수
		int C = sc.nextInt(); // 두 번째 바구니에 있는 사과의 수
		int D = sc.nextInt(); // 두 번째 바구니에 있는 오렌지의 수
		
		System.out.println(Math.min(A + D, B + C));
		sc.close();
	}
}