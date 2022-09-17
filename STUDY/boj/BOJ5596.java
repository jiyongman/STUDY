package boj;
import java.util.*;

public class BOJ5596 { // 시험 점수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int S = 0; // 민국이의 총점
        int T = 0; // 만세의 총점

        for (int i = 0; i < 4; i++) {
            S += sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            T += sc.nextInt();
        }

        if (S >= T) {
            System.out.println(S);
        } else {
            System.out.println(T);
        }

        sc.close();
    }
}