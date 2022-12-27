package boj;
import java.util.*;

public class BOJ26940 { // Chokladkartongen

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;

        for (int i = 1; i < N; i++) {
            if (arr[i - 1] < arr[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}