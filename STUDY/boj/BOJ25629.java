package boj;
import java.util.*;

public class BOJ25629 { // 홀짝 수열

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수열의 길이
        int odd = 0;
        int even = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();

            if (a % 2 > 0) {
                odd++;
            } else {
                even++;
            }
        }

        if (N % 2 > 0) {
            if (odd == N / 2 + 1 && even == N / 2) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            if (odd == N / 2 && even == N / 2) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }
}