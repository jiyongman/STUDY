package boj;
import java.util.*;

public class BOJ10797 { // 10부제

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(); // 날짜의 일의 자리 숫자
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            if (d == arr[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}