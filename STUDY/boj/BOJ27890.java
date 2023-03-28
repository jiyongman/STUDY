package boj;
import java.util.*;

public class BOJ27890 { // 특별한 작은 분수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if (x % 2 == 0) {
                x = (x / 2) ^ 6;
            } else {
                x = (2 * x) ^ 6;
            }
        }

        System.out.println(x);
        sc.close();
    }
}