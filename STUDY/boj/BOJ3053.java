package boj;
import java.util.*;

public class BOJ3053 { // 택시 기하학

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble();
		
		System.out.println(Math.PI * R * R); // 유클리드 기하학
		System.out.println(2 * R * R); // 택시 기하학
		sc.close();
	}
}