package boj;
import java.util.*;

public class BOJ5217 { // 쌍의 합

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            System.out.print("Pairs for " + n + ": ");

            for (int j = 1; j <= n / 2; j++) {
                for (int k = j + 1; k <= n; k++) {
                    if (j + k == n && j != k) {
                        System.out.print(j + " " + k);

                        if (k - 2 > j) {
                            System.out.print(", ");
                        }
                    }
                }
            }

            System.out.println();
        }

        sc.close();
    }
}