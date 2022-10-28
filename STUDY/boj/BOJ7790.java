package boj;
import java.util.*;

public class BOJ7790 { // Joke

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            for (int i = 0; i < str.length() - 3; i++) {
                if (str.substring(i, i + 4).equals("joke")) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}