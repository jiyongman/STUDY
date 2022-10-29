package boj;
import java.util.*;

public class BOJ7120 { // String

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                System.out.print(str.charAt(i - 1));
            }
        }

        System.out.print(str.charAt(str.length() - 1));

        sc.close();
    }
}
