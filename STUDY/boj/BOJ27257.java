package boj;
import java.util.*;

public class BOJ27257 { // Любитель нулей

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        while (k % 10 == 0) {
            k /= 10;
        }

        int cnt = 0;

        while (k > 0) {
            if (k % 10 == 0) {
                cnt++;
            }
            k /= 10;
        }

        System.out.println(cnt);
        sc.close();
    }
}