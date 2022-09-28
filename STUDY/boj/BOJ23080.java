package boj;
import java.util.*;

public class BOJ23080 { // 스키테일 암호

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // 막대의 굵기
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if (i % K == 0) {
                System.out.print(str.charAt(i));
            }
        }

        sc.close();
    }
}