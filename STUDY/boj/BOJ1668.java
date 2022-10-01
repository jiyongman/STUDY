package boj;
import java.util.*;

public class BOJ1668 { // 트로피 진열

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 트로피의 개수
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 트로피의 높이
        }

        int max = 0;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
                cnt++;
            }
        }

        int max2 = 0;
        int cnt2 = 0;

        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] > max2) {
                max2 = arr[i];
                cnt2++;
            }
        }

        System.out.println(cnt);
        System.out.println(cnt2);
        sc.close();
    }
}