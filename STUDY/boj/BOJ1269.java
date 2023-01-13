package boj;
import java.util.*;

public class BOJ1269 { // 대칭 차집합

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < A; i++) {
            set.add(sc.nextInt());
        }

        int a_cnt = A;
        int b_cnt = 0;

        for (int i = 0; i < B; i++) {
            int tmp = sc.nextInt();

            if (set.contains(tmp)) {
                a_cnt--;
            } else {
                b_cnt++;
            }
        }

        int cnt = a_cnt + b_cnt;

        System.out.println(cnt);
        sc.close();
    }
}