package boj;
import java.util.*;

public class BOJ16483 { // 접시 안의 원
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double T = sc.nextDouble(); // 작은 원의 접선이 큰 원과 만나는 두 점 사이의 거리
		
		double result = Math.pow(T / 2, 2);
		System.out.println(Math.round(result));
		sc.close();
	}
}