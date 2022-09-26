package boj;
import java.util.*;

public class BOJ25628 { // 햄버거 만들기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 햄버거 빵의 개수
        int B = sc.nextInt(); // 햄버거 패티의 개수
        int cnt = 0;

        while (true) {
            if (A < 2 || B < 1) {
                break;
            }

            A -= 2;
            B--;
            cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}