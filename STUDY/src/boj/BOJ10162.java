package boj;
import java.util.*;

public class BOJ10162 { // 전자레인지

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 요리 시간(초)
        int a = 0;
        int b = 0;
        int c = 0;

        if (T >= 300) {
            a = T / 300;
            T = T % 300;
        }
        if (T >= 60) {
            b = T / 60;
            T = T % 60;
        }
        if (T >= 10) {
            c = T / 10;
            T = T % 10;
        }
        if (T == 0) {
            System.out.println(a + " " + b + " " + c);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}