package boj;
import java.util.*;

public class BOJ5343 { // Parity Bit

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of lines of data transmitted

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int result = 0;

            for (int j = 0; j < str.length(); j += 8) {
                int cnt = 0;

                for (int k = j; k < j + 7; k++) {
                    if (str.charAt(k) == '1') {
                        cnt++;
                    }
                }

                if ((cnt % 2 > 0 && str.charAt(j + 7) != '1') || (cnt % 2 == 0 && str.charAt(j + 7) != '0')) {
                    result++;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}