package boj;
import java.util.*;

public class BOJ5566 { // 주사위 게임

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt(); // 상근이가 주사위를 던진 횟수
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int tmp = 0;
        int cnt = 0;

        for (int i = 0; i < M; i++) {
            tmp += sc.nextInt();
            cnt++;

            if (tmp >= N) {
                break;
            }

            tmp += arr[tmp];

            if (tmp >= N) {
                break;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}