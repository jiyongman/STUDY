package boj;
import java.util.*;

public class BOJ25904 { // 안녕 클레오파트라 세상에서 제일가는 포테이토칩

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 게임에 참여하는 사람 수
        int X = sc.nextInt(); // 1번이 처음으로 낼 목소리의 높이
        int[] T = new int[N];

        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt(); // i번이 낼 수 있는 목소리 높이의 상한선
        }

        int i = 0;

        while (T[i % N] >= X) {
            X++;
            i++;
        }

        System.out.println(i % N + 1);
        sc.close();
    }
}