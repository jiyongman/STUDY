package boj;
import java.util.*;

public class BOJ15494 { // Davor

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 100; i >= 1; i--) {
            for (int j = 1; j <= 100; j++) {
                if (i * 7 * 52 + j * 21 * 52 == N) {
                    System.out.println(i);
                    System.out.println(j);
                    return;
                }
            }
        }

        sc.close();
    }
}