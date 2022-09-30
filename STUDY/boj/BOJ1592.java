package boj;
import java.util.*;

public class BOJ1592 { // 영식이와 친구들

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 자리의 수
        int M = sc.nextInt();
        int L = sc.nextInt();
        int[] arr = new int[N];
        int i = 0;
        int cnt = 0;

        while (true) {
            arr[i]++;

            if (arr[i] == M) {
                break;
            }

            if (arr[i] < M) {
                if (arr[i] % 2 > 0) {
                    i += L;
                } else {
                    i -= L;
                }
            }

            if (i >= N) {
                i -= N;
            } else if (i < 0) {
                i += N;
            }

            cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}