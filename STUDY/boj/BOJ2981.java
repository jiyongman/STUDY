package boj;
import java.util.*;

public class BOJ2981 { // 검문

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int val = arr[1] - arr[0];

        for (int i = 2; i < N; i++) {
            val = gcd(val, arr[i] - arr[i - 1]);
        }

        for (int i = 2; i <= val; i++) {
            if (val % i == 0) {
                System.out.printf("%d ", i);
            }
        }

        sc.close();
    }

    public static int gcd(int p, int q) {

        if (p < q) {
            int tmp = p;
            p = q;
            q = tmp;
        }

        if (q == 0) {
            return p;
        } else {
            return gcd(q, p % q);
        }
    }
}