package boj;
import java.util.*;

public class BOJ1297 { // TV 크기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt(); // TV 대각선 길이
		int H = sc.nextInt(); // TV 높이 비율
		int W = sc.nextInt(); // TV 너비 비율
		double result = Math.pow(D , 2) / (Math.pow(H, 2) + Math.pow(W, 2));
		
		System.out.println((int) Math.sqrt(result * Math.pow(H, 2)) + " " + (int) Math.sqrt(result * Math.pow(W, 2))); // 
		sc.close();
	}
}