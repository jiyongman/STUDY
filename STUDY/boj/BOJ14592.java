package boj;
import java.util.*;

public class BOJ14592 { // 2017 아주대학교 프로그래밍 경시대회 (Small)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 참가자의 수
        int[] S = new int[N];
        int[] C = new int[N];
        int[] L = new int[N];
        int max = 0;
        int min = 51;
        int min2 = 180;

        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt(); // 참가자의 점수
            C[i] = sc.nextInt(); // 제출 횟수
            L[i] = sc.nextInt(); // 점수를 획득한 문제의 업로드 시간
        }

        int result = 1;

        for (int i = 0; i < N; i++) {
            if (S[i] > max) {
                max = S[i];
                min = C[i];
                min2 = L[i];
                result = i + 1;
            } else if (S[i] == max) {
                if (C[i] < min) {
                    max = S[i];
                    min = C[i];
                    min2 = L[i];
                    result = i + 1;
                } else if (C[i] == min) {
                    if (L[i] < min2) {
                        max = S[i];
                        min = C[i];
                        min2 = L[i];
                        result = i + 1;
                    }
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}