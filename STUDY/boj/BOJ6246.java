package boj;
import java.util.*;

public class BOJ6246 { // 풍선 놀이

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 슬롯 수
        int Q = sc.nextInt(); // 풍선들을 꽂는 횟수
        int[] arr = new int[N + 1];

        for (int a = 0; a < Q; a++) {
            int L = sc.nextInt();
            int I = sc.nextInt();

            for (int b = L; b <= N; b += I) {
                arr[b]++;
            }
        }

        int cnt = 0;

        for (int a = 1; a <= N; a++) {
            if (arr[a] == 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}