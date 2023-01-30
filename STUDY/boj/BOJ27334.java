package boj;
import java.util.*;

public class BOJ27334 { // マラソン大会 (Marathon Race)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] rank = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j && A[i] > A[j]) {
                    rank[i]++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(rank[i] + 1);
        }

        sc.close();
    }
}