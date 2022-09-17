package boj;
import java.util.*;

public class BOJ2914 { // 저작권
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 앨범에 수록된 곡의 개수
		int I = sc.nextInt(); // 평균값
		
		System.out.println(A * (I - 1) + 1);
		sc.close();
	}
}