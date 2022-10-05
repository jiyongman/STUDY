package boj;
import java.util.*;

public class BOJ14697 { // 방 배정하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 방의 정원
        int B = sc.nextInt(); // 방의 정원
        int C = sc.nextInt(); // 방의 정원
        int N = sc.nextInt(); // 전체 학생 수
        int cnt = 0;

        for (int i = 0; i <= N / A; i++) {
            for (int j = 0; j <= N / B; j++) {
                for (int k = 0; k <= N / C; k++) {
                    if (A * i + B * j + C * k == N) {
                        cnt++;
                        System.out.println(cnt);
                        return;
                    }
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}