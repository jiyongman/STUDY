package boj;
import java.io.*;
import java.util.*;

public class BOJ10816 { // 숫자 카드 2

    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st2.nextToken());

            sb.append(UpperBound(num, 0, N) - LowerBound(num, 0, N)).append(" ");
        }

        System.out.println(sb);
        br.close();
    }

    private static int LowerBound(int num, int left, int right) {

        while (left < right) {
            int mid = (left + right) / 2;

            if (num <= arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static int UpperBound(int num, int left, int right) {

        while (left < right) {
            int mid = (left + right) / 2;

            if (num < arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}