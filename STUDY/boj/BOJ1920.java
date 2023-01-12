package boj;
import java.util.*;

public class BOJ1920 { // 수 찾기

    static int[] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int num = sc.nextInt();

            System.out.println(BinarySearch(num, 0, N - 1));
        }

        sc.close();
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