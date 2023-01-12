package boj;
import java.io.*;
import java.util.*;

public class BOJ10815 { // 숫자 카드

    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st2.nextToken());

            bw.write(String.format("%d ", BinarySearch(num, 0, N - 1)));
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static int BinarySearch(int num, int left, int right) {

        if (left <= right) {
            int mid = (left + right) / 2;

            if (num < arr[mid]) {
                return BinarySearch(num, left, mid - 1);
            } else if (num > arr[mid]) {
                return BinarySearch(num, mid + 1, right);
            } else {
                return 1;
            }
        }

        return 0;
    }
}