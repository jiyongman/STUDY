package boj;
import java.util.*;

public class BOJ5691 { // 평균 중앙값 문제

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == 0 && B == 0) {
                break;
            }

            int C = A - (B - A);

            System.out.println(C);
        }

        sc.close();
    }
}