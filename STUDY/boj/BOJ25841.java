package boj;
import java.util.*;

public class BOJ25841 { // Digit Count

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // the range(min)
        String str2 = sc.next(); // the range(max)
        String str3 = sc.next(); // the digit
        int cnt = 0;

        for (int i = Integer.parseInt(str); i <= Integer.parseInt(str2); i++) {
            String tmp = String.valueOf(i);

            for (int j = 0; j < 4; j++) {
                if (tmp.charAt(j) == str3.charAt(0)) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}