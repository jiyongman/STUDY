package boj;
import java.util.*;

public class BOJ1681 { // 줄 세우기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int num = 1;
        int cnt = 0;

        while (true) {
            if (!String.valueOf(num).contains(String.valueOf(L))) {
                cnt++;
            }

            if (cnt == N) {
                System.out.println(num);
                break;
            }

            num++;
        }

        sc.close();
    }
}