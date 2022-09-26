package boj;
import java.util.*;

public class BOJ10902 { // Penalty calculation

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 문제에 제출한 답안의 수
        int[] t = new int[n];
        int[] s = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt(); // 대회가 시작하고 답안이 제출된 시간(분)
            s[i] = sc.nextInt(); // 채점 결과
            max = Math.max(max, s[i]);
        }

        int f = 0;

        for (int i = 0; i < n; i++) {
            if (s[i] == max) {
                f = i;
                break;
            }
        }

        int P = 0; // 문제에 대한 페널티

        if (s[f] == 1 || s[f] == 4) {
            P = t[f] + f * 20;
        }

        System.out.println(P);
        sc.close();
    }
}