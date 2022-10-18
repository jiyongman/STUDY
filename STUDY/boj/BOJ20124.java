package boj;
import java.util.*;

public class BOJ20124 { // 모르고리즘 회장님 추천 받습니다

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 사람의 수
        String[] A = new String[N];
        int[] B = new int[N];
        int max = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.next();
            B[i] = sc.nextInt();
            max = Math.max(max, B[i]);
        }

        String str = "zzzzzzzzzz";
        int result = 0;

        for (int i = 0; i < N; i++) {
            if (max == B[i]) {
                if (A[i].compareTo(str) < 0) {
                    result = i;
                    str = A[i];
                }
            }
        }

        System.out.println(A[result]);
        sc.close();
    }
}