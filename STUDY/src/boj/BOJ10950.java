package boj;
import java.util.*;

public class BOJ10950 { // A + B - 3

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스
        
        for(int i = 0; i < T; i++) {
           int A = sc.nextInt();
           int B = sc.nextInt();
           System.out.println(A + B);
        }
        
        sc.close();
    }
}