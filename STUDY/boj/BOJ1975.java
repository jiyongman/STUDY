package boj;
import java.util.*;

public class BOJ1975 { // Number Game

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int num = N;
            int cnt = 0;

            for (int j = 2; j <= N; j++) {
                while (num > 0) {
                    if (num % j == 0) {
                        num /= j;
                        cnt++;
                    } else {
                        break;
                    }
                }

                num = N;
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}