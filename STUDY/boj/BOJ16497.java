package boj;
import java.util.*;

public class BOJ16497 { // 대출 요청

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 대출 요청의 개수
        int[] arr = new int[32];

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt(); // 한 사람의 대출일
            int B = sc.nextInt(); // 한 사람의 반납일

            for (int j = A; j < B; j++) {
                arr[j]++;
            }
        }

        int K = sc.nextInt(); // 책의 개수
        int max = 0;

        for (int i = 1; i <= 31; i++) {
            max = Math.max(max, arr[i]);
        }

        if (K >= max) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}