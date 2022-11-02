package boj;
import java.util.*;

public class BOJ4141 { // Numbersrebmun

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next().toUpperCase();
            str = str.replaceAll("[ABC]", "2");
            str = str.replaceAll("[DEF]", "3");
            str = str.replaceAll("[GHI]", "4");
            str = str.replaceAll("[JKL]", "5");
            str = str.replaceAll("[MNO]", "6");
            str = str.replaceAll("[PQRS]", "7");
            str = str.replaceAll("[TUV]", "8");
            str = str.replaceAll("[WXYZ]", "9");
            int cnt = 0;

            for (int j = 0; j < str.length() / 2; j++) {
                if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                    cnt++;
                }
            }

            if (cnt == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}