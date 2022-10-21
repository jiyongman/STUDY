package boj;
import java.util.*;

public class BOJ16944 { // 강력한 비밀번호

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 문자열의 길이
        String S = sc.next(); // 문자열
        int[] arr = new int[4];

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) >= '0' && S.charAt(i) <= '9') {
                arr[0]++;
            } else if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
                arr[1]++;
            } else if (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') {
                arr[2]++;
            } else {
                arr[3]++;
            }
        }

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result++;
            }
        }

        if (result + N < 6) {
            result = 6 - N;
        }

        System.out.println(result);
        sc.close();
    }
}