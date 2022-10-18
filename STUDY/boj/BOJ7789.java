package boj;
import java.util.*;

public class BOJ7789 { // 텔레프라임

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 기존 전화번호
        int M = sc.nextInt(); // 새로 추가되는 한 자리 번호
        int cnt = 0;
        int cnt2 = 0;

        for (int i = 2; i <= M * 1000000 + N; i++) {
            if (N % i == 0) {
                cnt++;
            }
            if ((M * 1000000 + N) % i == 0) {
                cnt2++;
            }
        }

        if (cnt == 1 && cnt2 == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}