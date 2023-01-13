package boj;
import java.util.*;

public class BOJ24060 { // 알고리즘 수업 - 병합 정렬 1

    static int K;
    static int[] A, tmp;
    static int cnt = 0;
    static int result = -1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        K = sc.nextInt();
        A = new int[N];
        tmp = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        merge_sort(A, 0, N - 1);

        System.out.println(result);
        sc.close();
    }

    public static void merge_sort(int[] A, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;
            merge_sort(A, left, mid);
            merge_sort(A, mid + 1, right);
            merge(A, left, mid, right);
        }
    }

    public static void merge(int[] A, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= right) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }

        while (i <= mid) {
            tmp[t++] = A[i++];
        }

        while (j <= right) {
            tmp[t++] = A[j++];
        }

        i = left;
        t = 0;

        while (i <= right) {
            cnt++;

            if (cnt == K) {
                result = tmp[t];
                break;
            }

            A[i++] = tmp[t++];
        }
    }
}