package boj;
import java.util.*;

public class BOJ25813 { // Changing Strings

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int tmp = 0;
        int tmp2 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'U') {
                tmp = i;
                break;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'F') {
                tmp2 = i;
            }
        }

        for (int i = 0; i < tmp; i++) {
            System.out.print("-");
        }

        System.out.print("U");

        for (int i = tmp + 1; i < tmp2; i++) {
            System.out.print("C");
        }

        System.out.print("F");

        for (int i = tmp2 + 1; i < str.length(); i++) {
            System.out.print("-");
        }

        sc.close();
    }
}