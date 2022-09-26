package boj;
import java.util.*;

public class BOJ9907 { // ID

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int sum = 0;
        int j = 2;

        for (int i = 0; i < N.length(); i++) {
            if (j < 2) {
                j = 7;
            }

            sum += (N.charAt(i) - '0') * j;
            j--;
        }

        String str = "JABCDEFGHIZ";
        char ch = str.charAt(sum % 11);

        System.out.println(ch);
        sc.close();
    }
}