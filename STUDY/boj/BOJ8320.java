package boj;
import java.util.*;

public class BOJ8320 { // 직사각형을 만드는 방법

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j * i <= n; j++) {
                result++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}