package boj;
import java.util.*;

public class BOJ17027 { // Shell Game

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of swaps
        int[] arr = new int[4];

        for (int i = 1; i <= 3; i++) {
            arr[i] = i;
        }

        int cnt = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for (int i = 1; i <= N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int g = sc.nextInt();
            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;

            if (arr[g] == 1) {
                cnt++;
            } else if (arr[g] == 2) {
                cnt2++;
            } else {
                cnt3++;
            }
        }

        int max = Math.max(cnt, Math.max(cnt2, cnt3));

        System.out.println(max);
        sc.close();
    }
}