package boj;
import java.util.*;

public class BOJ25551 { // 멋쟁이 포닉스

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int MW = sc.nextInt();
        int MB = sc.nextInt();
        int TW = sc.nextInt();
        int TB = sc.nextInt();
        int PW = sc.nextInt();
        int PB = sc.nextInt();
        int min = Math.min(MW, Math.min(TB, PW));
        int min2 = Math.min(MB, Math.min(TW, PB));

        if (min > min2) {
            System.out.println(min2 * 2 + 1);
        } else if (min < min2) {
            System.out.println(min * 2 + 1);
        } else {
            System.out.println(min * 2);
        }

        sc.close();
    }
}