package boj;
import java.util.*;

public class BOJ11478 { // 서로 다른 부분 문자열의 개수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        HashSet<String> set = new HashSet<>();

        for (int i = 1; i <= S.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (i + j <= S.length()) {
                    set.add(S.substring(j, i + j));
                }
            }
        }

        System.out.println(set.size());
        sc.close();
    }
}