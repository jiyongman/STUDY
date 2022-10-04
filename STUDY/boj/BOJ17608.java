package boj;
import java.util.*;

public class BOJ17608 { // 막대기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 막대기의 개수
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 막대기의 높이
        }

        int cnt = 0;
        int max = 0;

        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}