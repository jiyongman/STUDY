package boj;
import java.util.*;

public class BOJ26198 { // Chronogram

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            int sum = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch == 'I') {
                    sum++;
                } else if (ch == 'V') {
                    sum += 5;
                } else if (ch == 'X') {
                    sum += 10;
                } else if (ch == 'L') {
                    sum += 50;
                } else if (ch == 'C') {
                    sum += 100;
                } else if (ch == 'D') {
                    sum += 500;
                } else if (ch == 'M') {
                    sum += 1000;
                }
            }

            System.out.println(sum);
        }

        sc.close();
    }
}