package boj;
import java.util.*;

public class BOJ14425 { // 문자열 집합

    static String[] S;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        S = new String[N];

        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }

        Arrays.sort(S);
        String[] arr = new String[M];
        int cnt = 0;

        for (int i = 0; i < M; i++) {
            arr[i] = sc.next();
            cnt += BinarySearch(arr[i], 0, N - 1);
        }

        System.out.println(cnt);
        sc.close();
    }

    public static int BinarySearch(String str, int left, int right) {

        if (left <= right) {
            int mid = (left + right) / 2;

            if (str.compareTo(S[mid]) < 0) {
                return BinarySearch(str, left, mid - 1);
            } else if (str.compareTo(S[mid]) > 0) {
                return BinarySearch(str, mid + 1, right);
            } else {
                return 1;
            }
        }

        return 0;
    }
}