package boj;
import java.util.*;

public class BOJ23795 { // 사장님 도박은 재미로 하셔야 합니다
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		while (true) {
			int n = sc.nextInt();
			
			if (n == -1) {
				break;
			}
			
			sum += n;
		}
		
		System.out.println(sum);
		sc.close();
	}
}