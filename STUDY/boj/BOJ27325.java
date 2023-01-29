package boj;
import java.util.*;

public class BOJ27325 { // 3 つの箱 (Three Boxes)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int ball = 1;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'L') {
                ball--;
            } else {
                ball++;
            }

            if (ball >= 3) {
                cnt++;
            }

            if (ball < 1) {
                ball++;
            } else if (ball > 3) {
                ball--;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}