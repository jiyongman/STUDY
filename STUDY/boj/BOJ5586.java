package boj;
import java.util.*;

public class BOJ5586 { // JOI와 IOI

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int joi = 0;
        int ioi = 0;

        for (int i = 2; i < str.length(); i++) {
            if (str.charAt(i - 2) == 'J' && str.charAt(i - 1) == 'O' && str.charAt(i) == 'I') {
                joi++;
            } else if (str.charAt(i - 2) == 'I' && str.charAt(i - 1) == 'O' && str.charAt(i) == 'I') {
                ioi++;
            }
        }

        System.out.println(joi);
        System.out.println(ioi);
        sc.close();
    }
}