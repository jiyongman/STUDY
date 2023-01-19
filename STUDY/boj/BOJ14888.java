package boj;
import java.util.*;

public class BOJ14888 { // 연산자 끼워넣기

    static int N;
    static int[] arr;
    static int[] cnt_equation = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            cnt_equation[i] = sc.nextInt();
        }

        backtracking(0, 0);

        System.out.printf("%d\n%d", max, min);
        sc.close();
    }

    public static void backtracking(int k, int sum) {

        if (k == N - 1) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        if (k == 0) {
            sum = arr[0];
        }

        for (int i = 0; i < 4; i++) {
            if (cnt_equation[i] > 0) {
                cnt_equation[i]--;

                if (i == 0) {
                    backtracking(k + 1, sum + arr[k + 1]);
                } else if (i == 1) {
                    backtracking(k + 1, sum - arr[k + 1]);
                } else if (i == 2) {
                    backtracking(k + 1, sum * arr[k + 1]);
                } else {
                    backtracking(k + 1, sum / arr[k + 1]);
                }

                cnt_equation[i]++;
            }
        }
    }
}