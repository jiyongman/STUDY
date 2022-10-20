package boj;
import java.util.*;

public class BOJ25177 { // 서강의 역사를 찾아서

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 학교 내에 지금 시설이 있는 장소의 수
        int M = sc.nextInt(); // 예전에 시설이 있었던 장소들의 수
        int[] a = new int[Math.max(N, M)];
        int[] b = new int[M];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt(); // 지금 시설이 있는 N개의 장소들에 대해 성현이가 매긴 점수
        }

        for (int i = N; i < Math.max(N, M); i++) {
            a[i] = 0;
        }

        for (int i = 0; i < M; i++) {
            b[i] = sc.nextInt(); // 예전에 시설이 있었던 M개의 장소들에 대해 성현이가 매긴 점수
        }

        int max = 0;

        if (N < M) {
            for (int i = 0; i < Math.max(N, M); i++) {
                if (b[i] - a[i] > max) {
                    max = b[i] - a[i];
                }
            }
        } else {
            for (int i = 0; i < Math.min(N, M); i++) {
                if (b[i] - a[i] > max) {
                    max = b[i] - a[i];
                }
            }
        }

        System.out.println(max);
        sc.close();
    }
}