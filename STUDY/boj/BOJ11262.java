package boj;
import java.util.*;

public class BOJ11262 { // Minions’ Master

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // the number of people in the town
            int[] arr = new int[N];
            int sum = 0;
            double avg = 0;
            int cnt = 0;
            double per = 0;
            
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt(); // the power of each person in the town
                sum += arr[j];
            }

            avg = (double) sum / N;

            for (int j = 0; j < N; j++) {
                if (avg < arr[j]) {
                    cnt++;
                }
            }

            per = (double) cnt / N * 100;
            char ch = '%';
            System.out.printf("%.3f %.3f%c\n", avg, per, ch);
        }

        sc.close();
    }
}