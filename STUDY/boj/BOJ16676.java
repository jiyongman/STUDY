package boj;
import java.util.*;

public class BOJ16676 { // 근우의 다이어리 꾸미기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 근우의 연봉 최댓값
        int result = 10;
        int cnt = 1;

        while (N > result) {
            result = result * 10 + 10;
            cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}