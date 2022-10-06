package boj;
import java.util.*;

public class BOJ2858 { // 기숙사 바닥

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(); // 빨간색 타일의 수
        int B = sc.nextInt(); // 갈색 타일의 수
        int L = 0; // 상근이네 방의 크기
        int W = 0; // 상근이네 방의 크기
        int cnt = 0;

        for (int i = 3; i <= R + B; i++) {
            for (int j = 3; j <= R + B; j++) {
                if (i * j == R + B && (i - 2) * (j - 2) == B) {
                    L = Math.max(i, j);
                    W = Math.min(i, j);
                    cnt++;
                    break;
                }
            }
            if (cnt == 1) {
                break;
            }
        }

        System.out.printf("%d %d", L, W);
        sc.close();
    }
}