package boj;
import java.util.*;

public class BOJ9313 { // Integer Flipping

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == -1) {
                break;
            }

            String str = "";

            for (int i = 0; i < 32; i++) {
                if (n % 2 > 0) {
                    str += "1";
                } else {
                    str += "0";
                }

                n /= 2;
            }

            long result = 0;

            for (int i = 0; i < 32; i++) {
                if (str.charAt(i) == '1') {
                    result += Math.pow(2, 31 - i);
                }
            }

            System.out.println(result);

        }

        sc.close();
    }
}