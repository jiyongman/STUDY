package boj;
import java.util.*;

public class BOJ2525 { // 오븐 시계

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 현재 시간
        int B = sc.nextInt(); // 현재 분
        int C = sc.nextInt(); // 필요한 시간(분)
        A += C / 60;
        B += C % 60;
        
        if (B >= 60) {
            A += 1;
            B -= 60;
        }
        
        if (A >= 24) {
            A -= 24;
        }
        
        System.out.println(A + " " + B);
        sc.close();
    }
}