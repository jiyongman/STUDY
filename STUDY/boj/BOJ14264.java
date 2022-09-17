package boj;
import java.util.*;

public class BOJ14264 { // 정육각형과 삼각형
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double L = sc.nextDouble(); // 정육각형 한 변의 길이
		double S = L * L * Math.sqrt(3) / 4; // 면적이 제일 작은 삼각형의 면적
		
		System.out.println(S);
		sc.close();
	}
}