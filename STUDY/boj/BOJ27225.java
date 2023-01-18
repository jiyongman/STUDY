package boj;
import java.util.*;

public class BOJ27225 { // Класс

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;

        while (n > 0 && m > 0) {
            n--;
            m--;
            cnt += 2;
        }

        if ((n > 0 && n % 2 > 0) || (m > 0 && m % 2 > 0)) {
            cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}