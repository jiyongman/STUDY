package boj;
import java.util.*;

public class BOJ2765 { // 자전거 속도
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		while (true) {
			double A = sc.nextDouble(); // 지름
			double B = sc.nextDouble(); // 회전수
			double C = sc.nextDouble(); // 시간
			cnt++;
			
			if (B == 0) {
				break;
			}
			
			double PI = 3.1415927;
			double distance = A * PI * B / (5280 * 12);
			double MPH = distance / C * (60 * 60);
			
			System.out.println("Trip #" + cnt + ": " + String.format("%.2f", distance) + " " + String.format("%.2f", MPH));
		}
		
		sc.close();
	}
}