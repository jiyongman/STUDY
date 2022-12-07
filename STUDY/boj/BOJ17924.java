package boj;
import java.util.*;

public class BOJ17924 { // Cooking Water

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of times Edward boiled water in the last week
        int[] a = new int[N];
        int[] b = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt(); // from the start of second
            b[i] = sc.nextInt(); // to the end of second
        }

        for (int i = 0; i <= 1000; i++) {
            int cnt = 0;

            for (int j = 0; j < N; j++) {
                if (i >= a[j] && i <= b[j]) {
                    cnt++;
                }
            }

            if (cnt == N) {
                System.out.println("gunilla has a point");
                return;
            }
        }

        System.out.println("edward is right");
        sc.close();
    }
}