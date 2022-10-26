package boj;
import java.util.*;

public class BOJ12090 { // 초성 변환

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] arr = { "ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ" };

        for (int i = 0; i < S.length(); i++) {
            int n = S.charAt(i) - 0xAC00;

            System.out.print(arr[n / 28 / 21]);
        }

        sc.close();
    }
}