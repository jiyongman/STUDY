package boj;
import java.util.*;

public class BOJ17356 { // 욱 제
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble(); // 욱의 욱제력
		double B = sc.nextDouble(); // 제의 욱제력
		double M = (B - A) / 400;
		double W = 1 / (1 + Math.pow(10, M)); // 욱이 제를 이길 확률
		
		System.out.println(W);
		sc.close();
	}
}