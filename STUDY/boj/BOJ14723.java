package boj;
import java.util.*;

public class BOJ14723 { // 이산수학 과제

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;

        while (i * (i + 1) / 2 < N) {
            i++;
        }

        int a = 1; // 분자
        int b = i; // 분모
        int tmp = i * (i + 1) / 2 - N;

        while (tmp > 0) {
            a++;
            b--;
            tmp--;
        }

        System.out.printf("%d %d", a, b);
        sc.close();
    }
}