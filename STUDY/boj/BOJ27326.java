package boj;
import java.util.*;

public class BOJ27326 { // 二人三脚 (Three-Legged Race)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 1];
        boolean[] matched = new boolean[N + 1];

        for (int i = 0; i < 2 * N - 1; i++) {
            int tmp = sc.nextInt();
            A[tmp]++;

            if (A[tmp] == 2) {
                matched[tmp] = true;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (!matched[i]) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}