package boj;
import java.util.*;

public class BOJ27159 { // 노 땡스!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int sum = arr[0];

        for (int i = 1; i < N; i++) {
            if (arr[i] - arr[i - 1] != 1) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
        sc.close();
    }
}