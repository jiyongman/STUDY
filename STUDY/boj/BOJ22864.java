package boj;
import java.util.*;

public class BOJ22864 { // 피로도

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 피로도 증가
        int B = sc.nextInt(); // 한 시간 동안 가능한 작업량
        int C = sc.nextInt(); // 피로도 감소
        int M = sc.nextInt(); // 피로도 최대한계치
        int F = 0; // 피로도
        int W = 0; // 총 작업량

        for (int i = 0; i < 24; i++) {
            if (F + A <= M) {
                F += A;
                W += B;
            } else {
                F -= C;

                if (F < 0) {
                    F = 0;
                }
            }
        }

        System.out.println(W);
        sc.close();
    }
}