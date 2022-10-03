package boj;
import java.util.*;

public class BOJ1977 { // 완전제곱수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = 1000000001;
        int cnt = 0;

        for (int i = M; i <= N; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                sum += i;
                min = Math.min(min, i);
                cnt++;
            }
        }

        if (cnt > 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}