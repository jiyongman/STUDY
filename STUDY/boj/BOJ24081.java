package boj;
import java.util.*;

public class BOJ24081 { // 箱と鍵 (Boxes and Keys)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr2 = new int[M];

        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i] == arr2[j]) {
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}