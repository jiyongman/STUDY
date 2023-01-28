package boj;
import java.util.*;

public class BOJ20001 { // 고무오리 디버깅

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        while (true) {
            String str = sc.nextLine();

            if (str.equals("고무오리 디버깅 끝")) {
                break;
            }

            if (str.equals("문제")) {
                cnt++;
            } else if (str.equals("고무오리") && cnt == 0) {
                cnt += 2;
            } else if (str.equals("고무오리")) {
                cnt--;
            }
        }

        if (cnt == 0) {
            System.out.println("고무오리야 사랑해");
        } else {
            System.out.println("힝구");
        }

        sc.close();
    }
}