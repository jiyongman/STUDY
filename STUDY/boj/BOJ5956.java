package boj;
import java.util.*;

public class BOJ5956 { // Symmetry

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(recursive(N, M));
        sc.close();
    }

    public static int recursive(int N, int M) {

        if (N % 2 > 0 && M % 2 > 0) {
            return recursive(N / 2, M / 2) * 4 + 1 ;
        } else {
            return 0;
        }
    }
}