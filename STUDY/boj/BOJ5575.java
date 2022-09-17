package boj;
import java.util.*;

public class BOJ5575 { // 타임 카드

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int h1 = sc.nextInt(); // 출근 시간(시)
            int m1 = sc.nextInt(); // 출근 시간(분)
            int s1 = sc.nextInt(); // 출근 시간(초)
            int h2 = sc.nextInt(); // 퇴근 시간(시)
            int m2 = sc.nextInt(); // 퇴근 시간(분)
            int s2 = sc.nextInt(); // 퇴근 시간(초)
            int t1 = h1 * 3600 + m1 * 60 + s1; // 전체 출근 시간(초)
            int t2 = h2 * 3600 + m2 * 60 + s2; // 전체 퇴근 시간(초)
            int t = t2 - t1; // 전체 근무 시간(초)
            int h = t / 3600; // 근무 시간(시)
            int m = t % 3600 / 60; // 근무 시간(분)
            int s = t % 3600 % 60; // 근무 시간(초)

            System.out.println(h + " " + m + " " + s);
        }

        sc.close();
    }
}