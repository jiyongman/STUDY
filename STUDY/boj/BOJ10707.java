package boj;
import java.util.*;

public class BOJ10707 { // 수도요금
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // X사의 1리터당 요금
		int B = sc.nextInt(); // Y사의 기본요금
		int C = sc.nextInt(); // Y사의 요금이 기본요금이 되는 사용량의 상한
		int D = sc.nextInt(); // Y사의 1리터 당 추가요금
		int P = sc.nextInt(); // JOI군의 집에서 사용하는 한 달간 수도의 양
		int X = A * P;
		int Y;
		
		if (C < P) {
			Y = B + (P - C) * D;
		} else {
			Y = B;
		}
		
		System.out.println(Math.min(X, Y));
		sc.close();
	}
}