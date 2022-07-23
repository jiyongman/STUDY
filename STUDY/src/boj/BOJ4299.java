package boj;
import java.util.*;

public class BOJ4299 { // AFC 윔블던

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 두 팀 점수의 합
        int b = sc.nextInt(); // 두 팀 점수의 차

        if ((a + b) % 2 != 0 || a < b) { // 합과 차가 2의 배수가 아니거나 합이 차보다 작으면 -1 출력
            System.out.println(-1);
        } else {
            System.out.println((a + b) / 2 + " " + ((a + b) / 2 - b));
        }

        sc.close();
    }
}