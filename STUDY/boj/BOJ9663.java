package boj;
import java.util.*;

public class BOJ9663 { // N-Queen

    static int N, cnt;
    static int[] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        cnt = 0;
        arr = new int[N];
        backtracking(0);
        System.out.println(cnt);

        sc.close();
    }

    public static boolean check(int k) {

        for (int i = 0; i < k; i++) {
            if (arr[k] == arr[i] || Math.abs(arr[k] - arr[i]) == k - i) {
                return false;
            }
        }

        return true;
    }

    public static void backtracking(int k) {

        if (k == N) {
            cnt++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[k] = i;

            if (check(k)) {
                backtracking(k + 1);
            }
        }
    }
}