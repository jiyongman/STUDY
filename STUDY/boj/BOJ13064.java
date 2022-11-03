package boj;
import java.util.*;

public class BOJ13064 { // Cameras

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of captured car numbers

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int cnt = 0;

            if (str.length() == 8) {
                cnt++;
            }
            if ((str.charAt(0) >= '1' && str.charAt(0) <= '9') && (str.charAt(1) >= '1' && str.charAt(1) <= '9') && str.charAt(0) == str.charAt(1)) {
                cnt++;
            }
            if ((str.charAt(2) >= '1' && str.charAt(2) <= '9') && (str.charAt(3) >= '1' && str.charAt(3) <= '9')) {
                cnt++;
            }
            if (str.charAt(4) >= 'A' && str.charAt(4) <= 'Z') {
                cnt++;
            }
            if ((str.charAt(5) >= '1' && str.charAt(5) <= '9') && (str.charAt(6) >= '1' && str.charAt(6) <= '9') && (str.charAt(7) >= '1' && str.charAt(7) <= '9')) {
                cnt++;
            }

            if (cnt == 5) {
                System.out.println(str);
            }
        }

        sc.close();
    }
}