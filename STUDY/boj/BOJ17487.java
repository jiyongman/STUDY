package boj;
import java.util.*;

public class BOJ17487 { // 타자 연습

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] arr = {"qwertyasdfgzxcvb", "uiophjklnm"};
        int cnt = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < S.length(); i++) {
            if ((S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') || S.charAt(i) == ' ') {
                cnt++;
            }

            for (int j = 0; j < arr[0].length(); j++) {
                if (S.charAt(i) == arr[0].charAt(j) || S.charAt(i) == arr[0].charAt(j) - 32) {
                    left++;
                }
            }

            for (int j = 0; j < arr[1].length(); j++) {
                if (S.charAt(i) == arr[1].charAt(j) || S.charAt(i) == arr[1].charAt(j) - 32) {
                    right++;
                }
            }
        }

        while (cnt > 0) {
            if (left <= right) {
                left++;
            } else {
                right++;
            }

            cnt--;
        }

        System.out.printf("%d %d", left, right);
        sc.close();
    }
}