package boj;
import java.util.*;

public class BOJ9907 { // ID

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int i = 2;

        while (true) {
            sum += N % 10 * i;
            N /= 10;
            i++;

            if (N == 0) {
                break;
            }

            if (i > 7) {
                i = 2;
            }
        }

        String str = "JABCDEFGHIZ";
        char ch = str.charAt(sum % 11);

        System.out.println(ch);
        sc.close();
    }
}