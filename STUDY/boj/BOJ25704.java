package boj;
import java.util.*;

public class BOJ25704 { // 출석 이벤트

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 경태가 모은 출석 도장의 개수
        int P = sc.nextInt(); // 경태가 구매할 물건의 가격

        if (N >= 20) {
            P = Math.min(P * 75 / 100, Math.min(P - 2000, Math.min(P * 90 / 100, P - 500)));
        } else if (N >= 15) {
            P = Math.min(P - 2000, Math.min(P * 90 / 100, P - 500));
        } else if (N >= 10) {
            P = Math.min(P * 90 / 100, P - 500);
        } else if (N >= 5) {
            P -= 500;
        }

        if (P < 0) {
            P = 0;
        }

        System.out.println(P);
        sc.close();
    }
}