package boj;
import java.util.*;

public class BOJ21918 { // 전구

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 전구의 개수
        int M = sc.nextInt(); // 입력되는 명령어의 개수
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 1) {
                arr[b - 1] = c;
            } else if (a == 2) {
                for (int j = b - 1; j < c; j++) {
                    if (arr[j] == 1) {
                        arr[j] = 0;
                    } else {
                        arr[j] = 1;
                    }
                }
            } else if (a == 3) {
                for (int j = b - 1; j < c; j++) {
                    arr[j] = 0;
                }
            } else {
                for (int j = b - 1; j < c; j++) {
                    arr[j] = 1;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", arr[i]);
        }

        sc.close();
    }
}