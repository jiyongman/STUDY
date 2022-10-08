package boj;
import java.util.*;

public class BOJ2966 { // 찍기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 필기시험의 문제의 수
        String str = sc.next();
        char[] arr = {'A', 'B', 'C'};
        char[] arr2 = {'B', 'A', 'B', 'C'};
        char[] arr3 = {'C', 'C', 'A', 'A', 'B', 'B'};
        int cnt = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for (int i = 0; i < N; i++) {
            if (str.charAt(i) == arr[i % 3]) {
                cnt++;
            }

            if (str.charAt(i) == arr2[i % 4]) {
                cnt2++;
            }

            if (str.charAt(i) == arr3[i % 6]) {
                cnt3++;
            }
        }

        int max = Math.max(cnt, Math.max(cnt2, cnt3));

        System.out.println(max);

        if (max == cnt) {
            System.out.println("Adrian");
        }

        if (max == cnt2) {
            System.out.println("Bruno");
        }

        if (max == cnt3) {
            System.out.println("Goran");
        }

        sc.close();
    }
}