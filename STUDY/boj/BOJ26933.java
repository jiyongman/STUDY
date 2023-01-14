package boj;
import java.util.*;

public class BOJ26933 { // Receptet

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int H = sc.nextInt();
            int B = sc.nextInt();
            int K = sc.nextInt();

            while (H < B) {
                sum += K;
                H++;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}