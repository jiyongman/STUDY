package boj;
import java.util.*;

public class BOJ25600 { // Triathlon

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 참가자의 수
        int max = 0; // 가장 높은 점수
        int score = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt(); // 애드혹 문제 해결을 통해 얻은 점수
            int d = sc.nextInt(); // 다이나믹 프로그래밍 문제 해결을 통해 얻은 점수
            int g = sc.nextInt(); // 그리디 알고리즘 문제 해결을 통해 얻은 점수
            score = a * (d + g);
            
            if (a == (d + g)) {
                score *= 2;
            } 

            max = Math.max(max, score);
        }

        System.out.println(max);
        sc.close();
    }
}