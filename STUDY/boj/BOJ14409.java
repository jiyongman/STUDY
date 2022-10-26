package boj;
import java.util.*;

public class BOJ14409 { // Tuna

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of tunas
        int X  = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int P1 = sc.nextInt();
            int P2 = sc.nextInt();

            if (Math.abs(P1 - P2) <= X) {
                sum += Math.max(P1, P2);
            } else {
                int P3 = sc.nextInt();
                sum += P3;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}