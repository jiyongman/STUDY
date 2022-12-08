package boj;
import java.util.*;

public class BOJ5236 { // Longest Decreasing Suffix

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // the number of test cases

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            int cnt = 0;

            for (int j = str.length() - 1; j >= 1; j--) {
                if (str.charAt(j) >= str.charAt(j - 1)) {
                    break;
                }

                cnt++;
            }

            String LDS = str.substring(str.length() - 1 - cnt);

            System.out.printf("The longest decreasing suffix of %s is %s\n", str, LDS);
        }

        sc.close();
    }
}