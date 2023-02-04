package boj;
import java.util.*;

public class BOJ13774 { // Palindromes

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();

            if (str.equals("#")) {
                break;
            }

            boolean palindromes = false;

            for (int i = 0; i < str.length(); i++) {
                String tmp = str.substring(0, i) + str.substring(i + 1);
                int cnt = 0;

                for (int j = 0; j < tmp.length() / 2; j++) {
                    if (tmp.charAt(j) == tmp.charAt(tmp.length() - 1 - j)) {
                        cnt++;
                    }
                }

                if (cnt == tmp.length() / 2) {
                    palindromes = true;
                    System.out.println(tmp);
                    break;
                }
            }

            if (!palindromes) {
                System.out.println("not possible");
            }
        }

        sc.close();
    }
}