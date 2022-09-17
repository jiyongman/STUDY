package boj;
import java.util.*;

public class BOJ9493 { // 길면 기차, 기차는 빨라, 빠른 것은 비행기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int M = sc.nextInt(); // 거리
			double A = sc.nextDouble(); // 기차의 속도
			double B = sc.nextDouble(); // 비행기의 속도
			
			if (M == 0 && A == 0 && B == 0) {
				break;
			}
			
			double T = Math.round(M / (A / 3600) - (M / (B / 3600)));
			int H = (int) T / 3600;
			int MM = (int) T / 60 % 60;
			int SS = (int) T % 60;
			
			System.out.printf("%d:%02d:%02d\n", H, MM, SS);
		}
		
		sc.close();
	}
}