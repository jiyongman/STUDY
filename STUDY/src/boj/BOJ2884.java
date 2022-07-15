package boj;
import java.util.*;

public class BOJ2884 { // 알람 시계

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(); // 시간
        int M = sc.nextInt(); // 분
        
        if (M < 45) {
            H--;
            M = 60 - (45 - M);
            if (H < 0) {
                H = 23;
            }
            System.out.print(H + " " + M);
        } else {
            System.out.print(H + " " + (M - 45));
        }
        
        sc.close();
    }
}