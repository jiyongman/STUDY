package boj;
import java.util.*;

public class BOJ4592 { // 중복을 없애자

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();

            if (N == 0) {
                break;
            }

            int tmp = 0;

            for (int i = 0; i < N; i++) {
                int M = sc.nextInt();

                if (tmp != M) {
                    System.out.printf("%d ", M);
                }

                tmp = M;
            }

            System.out.println("$");
        }

        sc.close();
    }
}