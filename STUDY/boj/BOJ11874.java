package boj;
import java.util.*;

public class BOJ11874 { // ZAMKA

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int N = 0; // the minimal integer N such that L ≤ N ≤ D and the sum of its digits is X
        int M = 0; // the maximal integer M such that L ≤ M ≤ D and the sum of its digits is X
        int[] arr = new int[10001];

        for (int i = 1; i <= 10000; i++) {
            int j = i;

            while (j > 0) {
                arr[i] += j % 10;
                j /= 10;
            }
        }

        for (int i = L; i <= D; i++) {
            if (arr[i] == X) {
                N = i;
                break;
            }
        }

        for (int i = D; i >= L; i--) {
            if (arr[i] == X) {
                M = i;
                break;
            }
        }

        System.out.println(N + "\n" + M);
        sc.close();
    }
}