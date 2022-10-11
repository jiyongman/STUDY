package boj;
import java.util.*;

public class BOJ12778 { // CTP공국으로 이민 가자

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 시험문제의 개수

        for (int i = 0; i < T; i++) {
            int M = sc.nextInt(); // 알파벳 또는 숫자의 개수
            String str = sc.next();

            if (str.equals("C")) {
                for (int j = 0; j < M; j++) {
                    char ch = sc.next().charAt(0);
                    int n = ch - 'A' + 1;

                    System.out.printf("%d ", n);
                }
            } else {
                for (int j = 0; j < M; j++) {
                    int n = sc.nextInt();
                    char ch = (char) (n + 'A' - 1);

                    System.out.printf("%c ", ch);
                }
            }

            System.out.println();
        }

        sc.close();
    }
}