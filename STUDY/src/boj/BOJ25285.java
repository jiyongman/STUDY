package boj;
import java.util.*;

public class BOJ25285 { // 심준의 병역판정검사

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 병역판정검사를 받는 사람의 수
		
		for (int i = 0; i < T; i++) {
			double a = sc.nextDouble(); // 키
			double b = sc.nextDouble(); // 몸무게
			double c = b / (a * a / 10000); // BMI(kg/m^2)
			
			if (a < 140.1) {
				System.out.println("6");
			} else if (a < 146) {
				System.out.println("5");
			} else if (a < 159) {
				System.out.println("4");
			} else if (a < 161) {
				if (c >= 16.0 && c < 35.0) {
					System.out.println("3");
				} else {
					System.out.println("4");
				}
			} else if (a < 204) {
				if (c >= 20.0 && c < 25.0) {
					System.out.println("1");
				} else if (c >= 18.5 && c < 30.0) {
					System.out.println("2");
				} else if (c >= 16.0 && c < 35.0) {
					System.out.println("3");
				} else {
					System.out.println("4");
				}
			} else {
				System.out.println("4");
			}
		}
		
		sc.close();
	}
}