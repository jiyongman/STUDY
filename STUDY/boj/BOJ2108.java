package boj;
import java.util.*;

public class BOJ2108 { // 통계학

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        double sum = 0;
        int[] cnt = new int[8001];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            cnt[arr[i] + 4000]++;
        }

        Arrays.sort(arr);
        int max = 0;

        for (int i = 0; i <= 8000; i++) {
            if (max < cnt[i]) {
                max = cnt[i];
            }
        }

        int[] array = new int[N];
        int j = 0;

        for (int i = 0; i <= 8000; i++) {
            if (max == cnt[i]) {
                array[j] = i - 4000;
                j++;
            }
            if (j == 2) {
                break;
            }
        }

        double mean = sum / N; // 산술평균
        int median = arr[N / 2]; // 중앙값
        int mode = array[j - 1]; // 최빈값
        int range = arr[N - 1] - arr[0]; // 범위

        System.out.println(Math.round(mean));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
        sc.close();
    }
}