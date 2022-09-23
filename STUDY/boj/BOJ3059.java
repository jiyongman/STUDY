package boj;
import java.util.*;

public class BOJ3059 { // 등장하지 않는 문자의 합

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            boolean[] bl = new boolean[26];

            for (int j = 0; j < str.length(); j++) {
                bl[str.charAt(j) - 'A'] = true;
            }
            
            int result = 0;
            
            for (int j = 0; j < 26; j++) {
                if (!bl[j]) {
                    result += j + 'A';
                }
            }

            System.out.println(result);
        }

        sc.close();
    }   
}