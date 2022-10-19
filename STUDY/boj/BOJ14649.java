package boj;
import java.util.*;

public class BOJ14649 { // 문홍안

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt(); // 김그네 씨의 재산
        int N = sc.nextInt(); // 비서의 수
        int[] arr = new int[101];

        for (int i = 0; i < N; i++) {
            int K = sc.nextInt();
            String str = sc.next();

            if (str.equals("L")) {
                while (K > 0) {
                    arr[K - 1]++;
                    K--;
                }
            } else {
                while (K < 100) {
                    arr[K + 1]++;
                    K++;
                }
            }
        }

        double M = 0;
        double H = 0;
        double A = 0;

        for (int i = 1; i <= 100; i++) {
            if (arr[i] % 3 == 0) {
                M++;
            } else if (arr[i] % 3 == 1) {
                H++;
            } else {
                A++;
            }
        }

        System.out.printf("%.2f\n", P / (M + H + A) * M);
        System.out.printf("%.2f\n", P / (M + H + A) * H);
        System.out.printf("%.2f", P / (M + H + A) * A);
        sc.close();
    }
}