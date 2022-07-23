package boj;
import java.util.*;

public class BOJ5543 { // 상근날드

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 상덕버거
        int b = sc.nextInt(); // 중덕버거
        int c = sc.nextInt(); // 하덕버거
        int d = sc.nextInt(); // 콜라
        int e = sc.nextInt(); // 사이다

        System.out.println(Math.min(Math.min(a, b), c) + Math.min(d, e) - 50);
        sc.close();
    }
}