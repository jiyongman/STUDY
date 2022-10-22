package boj;
import java.util.*;

public class BOJ2756 { // 다트

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < t; i++) {
            int N = 0; // 첫 번째 플레이어의 점수
            int M = 0; // 두 번째 플레이어의 점수

            for (int j = 0; j < 3; j++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();

                if (x * x + y * y <= 9) {
                    N += 100;
                } else if (x * x + y * y <= 36) {
                    N += 80;
                } else if (x * x + y * y <= 81) {
                    N += 60;
                } else if (x * x + y * y <= 144) {
                    N += 40;
                } else if (x * x + y * y <= 225) {
                    N += 20;
                }
            }

            for (int j = 0; j < 3; j++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();

                if (x * x + y * y <= 9) {
                    M += 100;
                } else if (x * x + y * y <= 36) {
                    M += 80;
                } else if (x * x + y * y <= 81) {
                    M += 60;
                } else if (x * x + y * y <= 144) {
                    M += 40;
                } else if (x * x + y * y <= 225) {
                    M += 20;
                }
            }

            String S = "";

            if (N > M) {
                S = "PLAYER 1 WINS.";
            } else if (N < M) {
                S = "PLAYER 2 WINS.";
            } else {
                S = "TIE.";
            }

            System.out.printf("SCORE: %d to %d, %s\n", N, M, S);
        }

        sc.close();
    }
}