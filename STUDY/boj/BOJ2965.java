package boj;
import java.util.*;

public class BOJ2965 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 캥거루1의 좌표
        int b = sc.nextInt(); // 캥거루2의 좌표
        int c = sc.nextInt(); // 캥거루3의 좌표
        int result = 0;

        if (c - b > b - a) {
            result = c - b - 1;
        } else {
            result = b - a - 1;
        }

        System.out.println(result);
        sc.close();
    }
}