package boj;
import java.util.*;

public class BOJ17249 { // 태보태보 총난타

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = 0;
        int l = 0; // 왼손의 잔상의 수
        int r = 0; // 오른손의 잔상의 수

        while (str.charAt(i) != '0') {
            if (str.charAt(i) == '@') {
                l++;
            }

            i++;
        }

        int j = str.length() - 1;

        while (str.charAt(j) != '0') {
            if (str.charAt(j) == '@') {
                r++;
            }

            j--;
        }

        System.out.printf("%d %d", l, r);
        sc.close();
    }
}