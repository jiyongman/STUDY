package boj;
import java.util.*;

public class BOJ2386 { // 도비의 영어 공부

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();

            if (str.equals("#")) {
                break;
            }

            String str2 = sc.nextLine();
            int cnt = 0;

            for (int i = 0; i < str2.length(); i++) {
                if (str.charAt(0) == str2.charAt(i) || str.charAt(0) - 32 == str2.charAt(i)) {
                    cnt++;
                }
            }

            System.out.printf("%s %d\n", str, cnt);
        }

        sc.close();
    }
}