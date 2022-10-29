package boj;
import java.util.*;

public class BOJ9558 { // Between the Mountains

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // the number of reported altitudes
            int[] arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt(); // the altitudes reported from this mountain
            }

            int N2 = sc.nextInt(); // the number of reported altitudes
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < N2; j++) {
                int A = sc.nextInt(); // the altitudes reported from this mountain

                for (int k = 0; k < N; k++) {
                    if (min > Math.abs(arr[k] - A)) {
                        min = Math.abs(arr[k] - A);
                    }
                }
            }

            System.out.println(min);
        }

        sc.close();
    }
}