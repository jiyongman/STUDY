package boj;
import java.util.*;

public class BOJ14175 { // The Cow-Signal

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        for (int i = 0; i < M; i++) {
            String str = sc.next();

            for (int j = 0; j < K; j++) {
                for (int p = 0; p < N; p++) {
                    for (int q = 0; q < K; q++) {
                        System.out.print(str.charAt(p));
                    }
                }

                System.out.println();
            }
        }

        sc.close();
    }
}