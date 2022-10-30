package boj;
import java.util.*;

public class BOJ13627 { // Dangerous Dive

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of volunteers that went to the mission
        int R = sc.nextInt(); // the number of volunteers that returned from the mission
        int[] arr = new int[N + 1];

        for (int i = 0; i < R; i++) {
            int V = sc.nextInt(); // the volunteers which returned from the mission
            arr[V] = V;
        }

        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            if (arr[i] != i) {
                System.out.printf("%d ", i);
            } else {
                cnt++;
            }
        }

        if (cnt == N) {
            System.out.println("*");
        }

        sc.close();
    }
}