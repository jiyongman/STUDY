package boj;
import java.util.*;

public class BOJ4892 { // 숫자 맞추기 게임
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		
		while (true) {
			int n0 = sc.nextInt();
			int n1;
			int n2;
			int n3;
			int n4;
			
			if (n0 == 0) {
				break;
			}
			
			n1 = 3 * n0;
			
			if (n1 % 2 == 0) {
				n2 = n1 / 2; 
			} else {
				n2 = (n1 + 1) / 2;
			}
			
			n3 = 3 * n2;
			n4 = n3 / 9;
			
			if (n1 % 2 != 0) {
				System.out.println(cnt + ". odd " + n4);
			} else {
				System.out.println(cnt + ". even " + n4);
			}
			cnt++;
		}
		
		sc.close();
	}
}