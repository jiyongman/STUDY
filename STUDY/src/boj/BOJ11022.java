package boj;
import java.util.*;

public class BOJ11022 { // A + B - 8

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스
        
        for(int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
        }
        
        sc.close();
    }
}