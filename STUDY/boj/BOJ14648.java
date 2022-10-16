package boj;
import java.util.*;

public class BOJ14648 { // 쿼리 맛보기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 수열의 길이
        int q = sc.nextInt(); // 쿼리의 개수
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int k = sc.nextInt();
            long sum = 0;

            if (k == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                for (int j = a - 1; j < b; j++) {
                    sum += arr[j];
                }

                int tmp = arr[a - 1];
                arr[a - 1] = arr[b - 1];
                arr[b - 1] = tmp;
            } else {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();

                for (int j = a - 1; j < b; j++) {
                    sum += arr[j];
                }

                for (int j = c - 1; j < d; j++) {
                    sum -= arr[j];
                }
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
