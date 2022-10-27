package boj;
import java.util.*;

public class BOJ5013 { // Death Knight Hero

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // the number of battles our hero played
        int cnt = n;

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j - 1) == 'C' && str.charAt(j) == 'D') {
                    cnt--;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}