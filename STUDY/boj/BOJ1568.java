package boj;
import java.util.*;

public class BOJ1568 { // 새

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 새의 수
        int i = 1;
        int cnt = 0;

        while (true) {
            if (N <= 0) {
                break;
            }

            if (N < i) {
                i = 1;
            }

            N -= i;
            cnt++;
            i++;
        }

        System.out.println(cnt);
        sc.close();
    }
}