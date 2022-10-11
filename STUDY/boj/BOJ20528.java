package boj;
import java.util.*;

public class BOJ20528 { // 끝말잇기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 문자열의 개수
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        for (int i = 1; i < N; i++) {
            if (arr[i].charAt(0) != arr[i - 1].charAt(0)) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
        sc.close();
    }
}